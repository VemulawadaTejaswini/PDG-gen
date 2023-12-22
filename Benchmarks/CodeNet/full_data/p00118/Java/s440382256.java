import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.awt.Point;
import java.util.Deque;
import java.util.ArrayDeque;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str;
while(!(str=br.readLine()).equals("0 0")){
String[] value=str.split(" ");
int h=Integer.parseInt(value[0]);
int w=Integer.parseInt(value[1]);
char[][] fruit=new char[h][w];
for(int i=0;i<h;i++){
fruit[i]=br.readLine().toCharArray();
}
Deque<Point> que=new ArrayDeque<Point>();
int ans=0;
for(int m=0;m<h;m++){
for(int n=0;n<w;n++){
if(fruit[m][n]!=','){
ans++;
Point p=new Point(n,m);
que.offerLast(p);
while(que.peekFirst()!=null){
p=que.pollFirst();
int x=p.x;
int y=p.y;
char rem=fruit[y][x];
fruit[y][x]=',';
int[] dx={-1,0,1,0};
int[] dy={0,-1,0,1};
for(int i=0;i<dx.length;i++){
int nx=x+dx[i];
int ny=y+dy[i];
if(fruit[ny][nx]==rem&&fruit[ny][nx]!=','&&nx>=0&&nx<w&&ny>=0&&ny<h){
Point np=new Point();
np.x=nx;
np.y=ny;
que.offerLast(np);
}
}
}
}
}
}
System.out.println(ans);
}
}
}