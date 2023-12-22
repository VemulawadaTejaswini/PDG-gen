import java.io.*;

class Main{

static final PrintWriter out=new PrintWriter(System.out);

public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
while((line=br.readLine())!=null&&!line.isEmpty()){
int n=Integer.parseInt(line);
char[] mem={'J','O','I'};
char[] pic=br.readLine().toCharArray();
long[][] dp=new long[n][8];
if(pic[0]=='J'){
dp[0][1]=1;
dp[0][4]=1;
dp[0][6]=1;
dp[0][7]=1;
}
if(pic[0]=='O'){
dp[0][4]=1;
dp[0][7]=1;
}
if(pic[0]=='I'){
dp[0][6]=1;
dp[0][7]=1;
}
for(int i=1;i<n;i++){
if(pic[i]=='J'){
dp[i][1]+=dp[i-1][1]+dp[i-1][4]+dp[i-1][6]++dp[i-1][7];
dp[i][4]+=dp[i-1][1]+dp[i-1][2]+dp[i-1][4]+dp[i-1][5]+dp[i-1][6]+dp[i-1][7];
dp[i][6]+=dp[i-1][1]+dp[i-1][3]+dp[i-1][4]+dp[i-1][5]+dp[i-1][6]+dp[i-1][7];
dp[i][7]+=dp[i-1][1]+dp[i-1][2]+dp[i-1][3]+dp[i-1][4]+dp[i-1][5]+dp[i-1][6]+dp[i-1][7];
}
if(pic[i]=='O'){
dp[i][2]+=dp[i-1][2]+dp[i-1][4]+dp[i-1][5]++dp[i-1][7];
dp[i][4]+=dp[i-1][2]+dp[i-1][1]+dp[i-1][4]+dp[i-1][6]+dp[i-1][5]+dp[i-1][7];
dp[i][5]+=dp[i-1][2]+dp[i-1][3]+dp[i-1][4]+dp[i-1][6]+dp[i-1][5]+dp[i-1][7];
dp[i][7]+=dp[i-1][2]+dp[i-1][1]+dp[i-1][3]+dp[i-1][4]+dp[i-1][6]+dp[i-1][5]+dp[i-1][7];
}
if(pic[i]=='I'){
dp[i][3]+=dp[i-1][3]+dp[i-1][5]+dp[i-1][6]++dp[i-1][7];
dp[i][5]+=dp[i-1][3]+dp[i-1][2]+dp[i-1][5]+dp[i-1][4]+dp[i-1][6]+dp[i-1][7];
dp[i][6]+=dp[i-1][3]+dp[i-1][1]+dp[i-1][5]+dp[i-1][4]+dp[i-1][6]+dp[i-1][7];
dp[i][7]+=dp[i-1][3]+dp[i-1][2]+dp[i-1][1]+dp[i-1][5]+dp[i-1][4]+dp[i-1][6]+dp[i-1][7];
}
}
out.println(dp[n-1][1]+dp[n-1][2]+dp[n-1][3]+dp[n-1][4]+dp[n-1][5]+dp[n-1][6]+dp[n-1][7]/10007);
out.flush();
}
}
}