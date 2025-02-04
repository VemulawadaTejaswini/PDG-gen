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
while((line=br.readLine())!=null&&!line.isEmpty()){
String[] values1=line.split(" ");
int v=Integer.parseInt(values[0]);
int e=Integer.parseInt(values[1]);
int r=Integer.parseInt(values[2]);
Edge[] es=new Edge[e];
int[] d=new int[v];
for(int i=0;i<e;i++){
String[] values2=br.readLine().split(" ");
int s=Integer.parseInt(values[0]);
int t=Integer.parseInt(values[1]);
int c=Integer.parseInt(values[2]);
es[i]=new Edge(s,t,c);
}
BellmanFord(e,r,es,d);
for(int i=0;i<v;i++) out.println(d[i]);
out.flush();
}
}

private static void BellmanFord(int e,int r,Edge[] es,int[] d){
Arrays.fill(d,INF);
d[r]=0;
while(true){
boolean update=false;
for(int i=0;i<e;i++){
Edge ee=es[i];
if(d[ee.to]>d[ee.from]+d[ee.cost]){
d[ee.to]=d[ee.from]+d[ee.cost];
update=true;
}
}
if(!update) break;
}
}
}