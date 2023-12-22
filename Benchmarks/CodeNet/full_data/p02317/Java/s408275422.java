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
dp[0]=num[0];
int len=1;
int ans=0;
for(int i=1;i<n;i++){
if(dp[len-1]<num[i]) dp[len++]=num[i];
else{
int index=lower_bound(dp,num[i]);
dp[index]=num[i];
}
}
out.println(len);
}
out.flush();
}
public static int lower_bound(int[] a,int val){
 int lb=-1,ub=a.length-1;
 while(ub-lb>1){
  int mid=(ub+lb)/2;
  if(a[mid]>=val){
   ub=mid;
  }
  else{
   lb=mid;
  }
 }
 return ub;
}

}