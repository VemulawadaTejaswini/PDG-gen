import java.io.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line;
char[][] map=new char[8][8];
int[] ax={1,0,1};
int[] ay={0,1,1};
int[] bx={1,2,3};
int[] by={0,0,0};
int[] cx={0,0,0};
int[] cy={1,2,3};
int[] dx={1,1,2};
int[] dy={0,-1,-1};
int[] ex={0,1,1};
int[] ey={1,1,2};
int[] fx={1,1,2};
int[] fy={0,1,1};
int[] gx={0,1,1};
int[] gy={1,0,-1};
while((line=br.readLine())!=null){
if(line.isEmpty()){
line=br.readLine();
}
boolean flag=false;
boolean f=false;
for(int j=0;j<8;i++){
map[0][j]=line.charAt(j);
if(!flag){
if(map[i][j]=='1'){
final int tx=i;
final int ty=j;
flag=true;
}
}
for(int i=1;i<8;i++){
line=br.readLine();
for(int j=0;j<8;i++){
map[i][j]=line.charAt(j);
if(!flag){
if(map[i][j]=='1'){
final int tx=i;
final int ty=j;
flag=true;
}
}
}
}
for(int i=0;i<3;i++){
if(map[tx+ax[i]][ty+ay[i]]!='1'){
break;
}
else if(i==2){
System.out.println("A");
f=true;
}
}
if(!f){
for(int i=0;i<3;i++){
if(map[tx+bx[i]][ty+by[i]]!='1'){
break;
}
else if(i==2){
System.out.println("B");
f=true;
}
}
}
if(!f){
for(int i=0;i<3;i++){
if(map[tx+cx[i]][ty+cy[i]]!='1'){
break;
}
else if(i==2){
System.out.println("C");
f=true;
}
}
}
if(!f){
for(int i=0;i<3;i++){
if(map[tx+dx[i]][ty+dy[i]]!='1'){
break;
}
else if(i==2){
System.out.println("D");
f=true;
}
}
}
if(!f){
for(int i=0;i<3;i++){
if(map[tx+ex[i]][ty+ey[i]]!='1'){
break;
}
else if(i==2){
System.out.println("E");
f=true;
}
}
}
if(!f){
for(int i=0;i<3;i++){
if(map[tx+fx[i]][ty+fy[i]]!='1'){
break;
}
else if(i==2){
System.out.println("F");
f=true;
}
}
}
if(!f){
for(int i=0;i<3;i++){
if(map[tx+gx[i]][ty+gy[i]]!='1'){
break;
}
else if(i==2){
System.out.println("G");
f=true;
}
}
}
}
}
}