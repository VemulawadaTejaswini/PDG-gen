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
for(int i=0;i<n;i++){
String[] str=br.readLine().split(",");
v[i]=Integer.parseInt(str[0]);
w[i]=Integer.parseInt(str[1]);
}
solve(W,n,v,w,count);
count++;
}
}
private static void solve(final int W,final int n,final int[] v,final int[] w,int count){
int[][] dp=new int[n+1][W+1];
int weight=0;
for(int i=0;i<=W;i++){
dp[n][i]=0;
}
for(int i=0;i<n;i++){
for(int j=W;j>=0;j--){
if(j>w[i]){
dp[i][j]=dp[i+1][j];
}
else{
int ret1=dp[i+1][j];
int ret2=dp[i+1][j-w[i]]+v[i];
if(ret1<ret2){
weight+=w[i];
dp[i][j]=ret2;
}
else{
dp[i][j]=ret1;
}
}
}
}
System.out.println("Case "+count+":");
System.out.println(dp[0][W]);
System.out.println(weight);
}
}