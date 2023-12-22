import java.io.*;
  
class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
int count=1;
while(!(line=br.readLine()).equals("0")){
int weight=0;
int W=Integer.parseInt(line);
int n=Integer.parseInt(br.readLine());
int[] v=new int[n];
int[] w=new int[n];
int[][] dp=new int[n+1][W+1];
boolean[] use=new boolean[n];
for(int i=0;i<n;i++){
String[] str=br.readLine().split(",");
v[i]=Integer.parseInt(str[0]);
w[i]=Integer.parseInt(str[1]);
}
System.out.println("Case "+count+":");
System.out.println(MaxValue(W,n,v,w,dp,use,0,W));
for(int i=0;i<n;i++){
if(use[i]){
weight+=w[i];
}
System.out.println(weight);
count++;
}
}
private static int MaxValue(int W,int n,int[] v,int[] w,int[][] dp,boolean[] use,int i,int j){
if(dp[i][j]!=0){
return dp[i][j];
}
else if(i==n){
return 0;
}
else if(j>w[i]){
use[i]=false;
return dp[i][j]=MaxValue(W,n,v,w,dp,use,i+1,j);
}
else{
int p=MaxValue(W,n,v,w,dp,use,i+1,j);
int q=MaxValue(W,n,v,w,dp,use,i+1,j-w[i])+v[i];
int r=Math.max(p,q);
use[i]=(p==r)?false:true;
return dp[i][j]=r;
}
}
}