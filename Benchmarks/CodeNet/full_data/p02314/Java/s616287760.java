import java.io.*;
import jav.util.Arrays;

class Main{

static final PrintWriter out=new PrintWriter(System.out);
static final int INF=Integer.MAX_VALUE/2;

public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=br.readLine())!=null&&!line.isEmpty()){
int n=Integer.parseInt(line.split(" ")[0]);
int m=Integer.parseInt(line.split(" ")[1]);
int[] v=new int[m];
line=br.readLine();
for(int i=0;i<m;i++) v[i]=Integer.parseInt(line.split(" ")[i]);
int[][] dp=new int[m+1][n+1];
Arrays.fill(dp[m],INF);
for(int i=0;i<=n;i++){
for(int j=m-1;j>=0;j--){
dp[j][i]=Math.min(dp[j+1][i],dp[j][i-v[j]]+1);
}
}
out.pritln(dp[0][n]);
}
out.flush();
}
}