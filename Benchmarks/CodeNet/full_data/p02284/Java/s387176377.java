import java.io.*;
import java.util.StringTokenizer;
    
class Main{
    
static final PrintWriter out=new PrintWriter(System.out);
 
static class binarySearchTree{
 
static class Node{
int id;
Node p;
Node l;
Node r;
int deg;
Node(int id){
this.id=id; this.p=null; this.l=null; this.r=null; this.deg=0;
}
}
 
private static Node root;
 
binarySearchTree(){
root=null;
}
 
public static void insert(int v){
if(root==null) root=new Node(v);
else __insert(new Node(v));
}
 
private static void __insert(Node z){
Node x=root;
Node y=null;
while(x!=null){
y=x;
if(z.id<x.id) x=x.l;
else x=x.r;
}
z.p=y;
if(z.id<y.id) y.l=z;
else y.r=z;
y.deg++;
}
 
public static boolean find(int v){
Node x=root;
while(x!=null){
if(x.id==v) return true;
else if(x.id>v) x=x.l;
else x=x.r;
}
return false;
}
 
public static void print(){
inorder(root);
out.println();
preorder(root);
out.println();
}
 
private static void preorder(Node now){
if(now==null) return;
out.print(" "+now.id);
preorder(now.l);
preorder(now.r);
}
  
private static void inorder(Node now){
if(now==null) return;
inorder(now.l);
out.print(" "+now.id);
inorder(now.r);
}
  
private static void postorder(Node now){
if(now==null) return;
postorder(now.l);
postorder(now.r);
out.print(" "+now.id);
}
}
 
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st;
binarySearchTree tree=new binarySearchTree();
int num=Integer.parseInt(br.readLine());
for(int i=0;i<num;i++){
st=new StringTokenizer(br.readLine());
String command=st.nextToken();
int n;
if("insert".equals(command)){
n=Integer.parseInt(st.nextToken());
tree.insert(n);
}
else if("find".equals(command)) {
n=Integer.parseInt(st.nextToken());
out.println((tree.find(n))?"yes":"no");
}
else tree.print();
}
out.flush();
}
}

