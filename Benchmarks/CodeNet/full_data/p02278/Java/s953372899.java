import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main{

static final PrintWriter out=new PrintWriter(System.out);

public static void main(Stirng[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=br.readLine())!=null&&!line.isEmpty()){
int n=Integer.parseInt(line);
int[] w=new int[n];
StringTokenizer st=new StringTokenizer(br.readLine());
for(int i=0;i<n;i++) w[i]=Integer.parseInt(st.nextToken());
int[] wd=w.clone();
Arrays.sort(wd);
int ans=0;
for(int i=0;i<=n/2;i++){
if(w[i]!=wd[i]) ans+=w[i]+wd[i];
}
out.println(ans);
}
out.flush();
}
}