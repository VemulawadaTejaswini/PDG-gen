import java.io.*;
import java.awt.*;
import java.util.*;
 
class Main{
static char[][] map=new char[9][5];
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line;
for(int i=0;i<9;i++){
line=br.readLine();
for(int j=0;j<4;j++){
map[i][j]=line.charAt(j);
}
if(i%2==1){
map[i][4]=line.charAt(4);
}
}
System.out.print("R");
gotoPath(0,1,"R");
System.out.print("\n");
}
static String turnLeft(String dir){
if(dir=="R"){
return "U";
}
if(dir=="U"){
return "L";
}
if(dir=="L"){
return "D";
}
else{
return "R";
}
}
static String turnRight(String dir){
if(dir=="R"){
return "D";
}
if(dir=="U"){
return "R";
}
if(dir=="L"){
return "U";
}
else{
return "L";
}
}
static String back(String dir){
if(dir=="R"){
return "L";
}
if(dir=="U"){
return "D";
}
if(dir=="L"){
return "R";
}
else{
return "U";
}
}
static boolean cangoNext(String dir,int x,int y){
if(dir=="R"){
if(y+1<=4&&map[2*x][y]=='1'){
return true;
}
else{
return false;
}
}
if(dir=="U"){
if(x-1>=0&&map[2*x-1][y]=='1'){
return true;
}
else{
return false;
}
}
if(dir=="L"){
if(y-1>=0&&map[2*x][y-1]=='1'){
return true;
}
else{
return false;
}
}
else{
if(x+1<=4&&map[2*x+1][y]=='1'){
return true;
}
else{
return false;
}
}
}
static void gotoPath(int x,int y,String d){
if(x==0&&y==0){
return;
}
String di;
String dir=d;
String dirl=turnLeft(dir);
String dirr=turnRight(dir);
String dirb=back(d);
if(cangoNext(dirl,x,y)){
System.out.print(dirl);
di=dirl;
}
else if(cangoNext(dir,x,y)){
System.out.print(dir);
di=dir;
}
else if(cangoNext(dirr,x,y)){
System.out.print(dirr);
String di=dirr;
}
else{
System.out.print(dirb);
String di=dirb;
}
if(di=="R"){
y++;
}
if(di=="U"){
x--;
}
if(di=="L"){
y--;
}
if(di=="D");{
x++;
}
gotoPath(x,y,di);
}
}