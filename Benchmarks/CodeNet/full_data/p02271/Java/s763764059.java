import java.io.*;
import java.util.StringTokenizer;

class Main{

static final PrintWriter out=new PrintWriter(System.out);

public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in);
String line="";
while((line=br.readLine())=br.readLine&&!line.isEmpty()){
int n=Integer.parseInt(line);
int[][] dp=new int[n+1][40001];
int[] a=new int[n];
StringTokenizer st1=new StringTokenizer(br.readLine());
for(int i=0;i<n;i++){
a[i]=Integer.parseInt(st1.nextToken());
}
int n=Integer.parseInt(br.readLine());
int[] b=new int[m];
StringTokenizer st2=new StringTokenizer(br.readLine());
int max=Integer.MIN_VALUE;
for(int i=0;i<m;i++){
b[i]=Integer.parseInt(st2.nextToken());
max=Math.max(max,b[i]);
}
dp[n][0]=1;
for(int i=n-1;i>=0;i--){
for(int j=0;j<=max;j++){
if(j<a[i]) dp[i][j]=dp[i+1][j];
else dp[i][j]=Math.max(dp[i+1][j],dp[i+1][j-a[i]]);
}
}
for(int i=0;i<m;i++){
out.println(dp[0][b[i]]==1?"yes":"no");
}
out.flush();
}
}
}