import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Comparator;
    
class Main{
    
static final int INF=Integer.MAX_VALUE/2;
static final PrintWriter out=new PrintWriter(System.out);
    
static class Pair{
int x;
int y;
Pair(int x,int y){
this.x=x; this.y=y;
}
static final Comparator<Pair> DISTANCE_ORDER=new DistanceOrderComparator();
public static class DistanceOrderComparator implements Comparator<Pair>{
public int compare(Pair p1,Pair p2){
return (p1.x>p2.x)?1:(p1.x<p2.x)?-1:0;
}
}
}

static class Edge{
int to;
int cost;
Edge(int to,int cost){
this.to=to; this.cost=cost;
}
}
    
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=br.readLine())!=null&&!line.isEmpty()){
int v=Integer.parseInt(line.split(" ")[0]);
int e=Integer.parseInt(line.split(" ")[1]);
int r=Integer.parseInt(line.split(" ")[2]);
HashMap<Integer,ArrayList<Edge>> dic=new HashMap<Integer,ArrayList<Edge>>();
int[] d=new int[v];
for(int i=0;i<e;i++){
line=br.readLine();
int s=Integer.parseInt(line.split(" ")[0]);
int t=Integer.parseInt(line.split(" ")[1]);
int c=Integer.parseInt(line.split(" ")[2]);
ArrayList<Edge> array;
if(!containsKey(s)){
array=new ArrayList<Edge>();
array.add(new Edge(t,c));
dic.put(s,array);
}
else{
array=dic.get(s);
array.add(new Edge(t,c));
dic.put(s,array);
}
}
djkstra(r,d,dic);
for(int i=0;i<v;i++) out.println((d[i]==INF)?"INF":d[i]);
}
}

private static void djkstra(int r,int[] d,HashMap<Integer,ArrayList<Edge>> dic){
PriorityQueue<Pair> pque=new PriorityQueue<Pair>(1,Pair.DISTANCE_ORDER);
Arrays.fill(d,INF);
d[r]=0;
pque.offer(new Pair(0,r));
while(!pque.isEmpty()){
Pair p=pque.poll();
int v=p.y;
if(d[v]<p.x) continue;
for(int i=0;i<dic.get(v).size();i++){
Edge e=dic.get(v).get(i);
if(d[e.to]>d[v]+e.cost){
d[e.to]=d[v]+e.cost;
pque.offer(new Pair(d[e.to],e.to));
}
}
}
}
}