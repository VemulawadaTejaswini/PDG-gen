import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main{

static final PrintWriter out=new PrintWriter(System.out);
static final int INF=Integer.MAX_VALUE/2;

public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=br.readLine())!=null&&!line.isEmpty()){
int n=Integer.parseInt(line.split(" ")[0]);
int wmax=Integer.parseInt(line.split(" ")[1]);
int[] v=new int[n];
int[] w=new int[n];
for(int i=0;i<n;i++){
line=br.readLine();
v[i]=Integer.parseInt(line.split(" ")[0]);
w[i]=Integer.parseInt(line.split(" ")[1]);
}
int[][] dp=new int[n+1][w+1];
for(int j=n-1;j>=0;j--){
for(int i=0;i<=wmax;i++){
if(i<w[j]) dp[j][i]=dp[j+1][i];
else dp[j][i]=Math.min(dp[j+1][i],dp[j][i-w[j]]+v[j]);
}
}
out.println(dp[0][wmax]);
}
out.flush();
}
}