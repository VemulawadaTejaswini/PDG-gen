import java.io.*;

class Main{

static final PrintWriter out=new PrintWriter(System.out);

public static class UnionFindTree{

private static int[] par;
private static int[] rank;

public UnionFindTree(int size){
par=new int[size];
rank=new int[size];
for(int i=0;i<size;i++){
par[i]=i;
rank[i]=0;
}
}

private static int find(int x){
if(par[x]==x) return x;
else return par[x]=find[x];
}

public static void unite(int x,int y){
x=find(x);
y=find(y);
if(x==y) return;
else if(rank[x]>rank[y]) par[y]=x;
else{
par[x]=y;
if(rank[x]==rank[y]) rank[y]++;
}
}

public static boolean same(int x,int y){
return find(x)==find(y);
}
}

public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
int num=Integer.parseInt(br.readLine());
UnionFindTree tree=new UnionFindTree(num);
while((line=br.readLine())!=null&&!line.isEmpty()){
String[] values=line.split(" ");
int query=Integer.parseInt(values[0]);
int x=Integer.parseInt(values[1]);
int y=Integer.parseInt(values[2]);
if(query==0) tree.unite(x,y);
else out.println(tree.same(x,y)?"1":"0");
}
out.flush();
}
}