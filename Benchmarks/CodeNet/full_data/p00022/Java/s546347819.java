import java.io.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str;
while((str=br.readLine())!="0"){
int n=Integer.parseInt(str);
int max=-1000000;
int[] s=new int[n+1];
s[0]=0;
for(int i=0;i<n;i++){
int m=Integer.parseInt(br.readLine());
s[i+1]+=m;
}
for(int a=0;a<n;a++){
for(int b=a+1;b<=n;b++){
max=Math.max(max,s[b]-s[a]);
}
}
System.out.println(max);
}
}
}