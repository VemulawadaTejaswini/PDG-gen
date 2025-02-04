import java.io.*;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.ArrayDeque;

class Main{

static final PrintWriter out=new PrintWriter(System.out);
static final int INF=Integer.MAX_VALUE/2;
static int[] d={-1,0,1};

static class TPair{
int t;
int x;
int y;
TPair(int t,int x,int y){
this.t=t; this.x=x; this.y=y;
}
}

public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=br.readLine())!=null&&!line.isEmpty()){
StringTokenizer st=new StringTokenizer(line);
int h=Integer.parseInt(st.nextToken());
int w=Integer.parseInt(st.nextToken());
int[][] map=new int[h][w];
for(int i=0;i<h;i++){
line=br.readLine();
for(int j=0;j<w;j++){
map[i][j]=(line.charAt(j)=='.')?INF:(int)(line.charAt(j)-'0');
}
}
out.println(bfs(h,w,map));
out.flush();
}
}

private static int bfs(int h,int w,int[][] map){
Deque<TPair> que=new ArrayDeque<TPair>();
int[][] hmap=new int[h][];
boolean update=true;
int ans=-1;
for(int i=0;i<h;i++){
for(int j=0;j<w;j++){
if(map[i][j]!=INF) que.offerLast(new TPair(0,i,j));
}
}
while(!que.isEmpty()){
TPair p=que.pollFirst();
if(ans!=p.t){
if(update){
update=false;
for(int i=0;i<h;i++) hmap[i]=map[i].clone();
ans=p.t;
}
else return ans;
}
int x=p.x;
int y=p.y;
int nx;
int ny;
int cnt1=0;
int cnt2=0;
int hxy=hmap[x][y];
loop:
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
if(i==1&&j==1) continue;
nx=x+d[i];
ny=y+d[j];
if(hmap[nx][ny]==INF) cnt1++;
if(hmap[nx][ny]<INF) cnt2++;
if(cnt1>=hxy){
map[x][y]=INF;
update=true;
break loop;
}
if(cnt2>8-hxy){
que.offerLast(new TPair(ans+1,x,y));
break loop;
}
}
}
}
}
}