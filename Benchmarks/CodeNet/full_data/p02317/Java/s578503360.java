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
int[] num=new int[n];
for(int i=0;i<n;i++) num[i]=Integer.parseInt(br.readLine());
int[] dp=new int[n];
Arrays.fill(dp,1);
int ans=0;
for(int i=n-2;i>=0;i--){
for(int j=i+1;j<=n-1;j++){
if(num[j]>num[i]) dp[i]=Math.max(dp[i],dp[j]+1);
}
ans=Math.max(ans,dp[i]);
}
out.println(ans);
}
out.flush();
}
}