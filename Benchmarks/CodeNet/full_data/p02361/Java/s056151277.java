import java.io.*;
import java.util.Arrays;

class Main{

static final int INF=Integer.MAX_VALUE/2;
static final PrintWriter out=new PrintWriter(System.out);


static class Edge{
int from;
int to;
int cost;
Edge(int from,int to,int cost){
this.from=from; this.to=to; this.cost=cost;
}
}

public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=br.readLine())!=null){
if(line.isEmpty()) continue;
int v=Integer.parseInt(line.split(" ")[0]);
int e=Integer.parseInt(line.split(" ")[1]);
int r=Integer.parseInt(line.split(" ")[2]);
Edge[] es=new Edge[e];
int[] d=new int[v];
for(int i=0;i<e;i++){
line=br.readLine();
int s=Integer.parseInt(line.split(" ")[0]);
int t=Integer.parseInt(line.split(" ")[1]);
int c=Integer.parseInt(line.split(" ")[2]);
es[i]=new Edge(s,t,c);
}
BellmanFord(e,r,es,d);
for(int i=0;i<v;i++){
if(d[i]==INF){
out.println("INF");
}
else{
out.println(d[i]);
}
}
out.flush();
}
}

private static void BellmanFord(int ee,int r,Edge[] es,int[] d){
Arrays.fill(d,INF);
d[r]=0;
while(true){
boolean update=false;
for(int i=0;i<ee;i++){
Edge e=es[i];
if(d[e.to]>d[e.from]+d[e.cost]){
d[e.to]=d[e.from]+d[e.cost];
update=true;
}
}
if(!update){
break;
}
}
}
}