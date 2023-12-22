import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
private int H=sc.nextInt();
private int W=sc.nextInt();
private String[][] k=new String[H][W];
for(int i=0; i< H; i++){
for(int j=0; j< W; j++){
k[i][j]=sc.next();
}
}
int num=0;
for(int i=0; i<H; i++){
for(int j=0; j<W; j++){
if(k[i][j]!="."){
dfs(i,j);
num++;
}
}
}
System.out.println(num);
}
void dfs(int I,int J){
String p=k[I][J];
k[I][J]=".";
int[] dx={-1,0,0,1};
int[] dy={0,-1,1,0};
for(int i=0;i<4;i++){
if(p==k[I+dx[i]][J+dy[i]]&&I+dx[i]>=0&&I+dx[i]<H&&J+dy[i]>=0&&J+dy[i]<W){
dfs(I+dx[i],J+dy[i]);
}
}
return;
}
}