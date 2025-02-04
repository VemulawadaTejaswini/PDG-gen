import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main{

static final PrintWriter out=new PrintWriter(System.out);
static boolean[] hasParent;

static class Node{
int id;
int p;
int rank;
int k;
int[] c;
String type;
Node(int id){
this.id=id; this.p=-1; this.rank=-1; this.type="";
}
}

public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputSreamReader(System.in));
int n=Integer.parseInt(br.readLine());
Node[] ns=new Node[n];
hasParent=new boolean[n];
for(int i=0;i<n;i++){
ns[i]=new Node(i);
}
for(int i=0;i<n;i++){
StringTokenizer st=new StringTokenizer(br.readLine());
int id=Integer.parseInt(st.nextToken());
Node n=ns[id];
int k=Integer.parseInt(st.nextToken());
n.k=k;
if(k==0) n.type="leaf";
else{
n.c=new int[k];
for(int j=0;j<k;j++){
int c=Integer.parseInt(st.nextToken());
n.c[j]=c;
ns[c].p=id;
hasParent[c]=true;
if(!"leaf".equals(ns[c].type)) ns[now].type="internal node";
}
Arrays.sort(ns.c);
}
}
for(int i=0;i<n;i++){
if(ns[i].rank<0) ns[i].rank=setRank(i,ns);
}
for(int i=0;i<n;i++){
Node an=ns[i];
StringBuilder sb=new StringBuider();
sb.append("node ");
sb.append(i);
sb.append(": parent = ");
sb.append(an.p);
sb.append(", depth = ");
sb.append(an.rank);
sb.append(", root, [");
if(an.k!=0){
for(int j=0;j<an.k;j++) sb.append((j==an.k-1)?an.c[j]:an.c[j]+",");
}
sb.append("]");
sb.append(System.getProperty("line.separator"));
out.println(sb);
}
out.flush();
}

private static int setRank(int now,Node[] ns){
if(!hasParent[now]){
ns[now].type="root";
return ns[now].rank=0;
}
return ns[now].rank=setRank(ns[now].p,ns)+1;
}
}