import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.awt.Point;
import java.util.*;
    
class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str;
while(!(str=br.readLine()).equals("0 0")){
String[] value=str.split(" ");
int h=Integer.parseInt(value[0]);
int w=Integer.parseInt(value[1]);
char[][] map=new char[h][w];
for(int i=0;i<h;i++){
map[i]=br.readLine().toCharArray();
}
Deque <Point> que=new  ArrayDeque<Point>();
int ans=0;
for(int m=0;m<h;m++){
for(int n=0;n<w;n++){
if(map[m][n]!='.'){
ans++;
Point p = new Point(n,m);
que.addLast(p);
while(que.peekFirst()!=null){
p=que.pollFirst();
int x=p.x;
int y=p.y;
char crop = map[y][x];
map[y][x]='.';
int [] dx ={0,1,0,-1};
int [] dy ={1,0,-1,0};                   
for(int i=0;i<4;i++){
int nx =x+dx[i];
int ny =y+dy[i];
if(nx>=0&&nx<w&&ny>=0&&ny<h&&map[ny][nx]==crop){
Point np = new Point(nx,ny);
que.addLast(np);                       
}
}
}
}
}
}System.out.println(ans);
}
}
}