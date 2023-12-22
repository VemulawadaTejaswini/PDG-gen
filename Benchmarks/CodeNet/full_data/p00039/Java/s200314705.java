import java.io.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line;
while((line=br.readLine())!=null){
int ans=0;
char[] n=line.toCharArray();
int[] fig=new int[n.length];
for(int i=0;i<fig.length;i++){
fig[i]=toNum(n[i]);
}
for(int i=1;i<fig.length;i++){
if(fig[i-1]<fig[i]){
fig[i-1]*=-1;
}
}
for(int i=0;i<fig.length;i++){
ans+=fig[i];
}
}
}
static int toNum(char c){
int n;
switch(c){
case 'I': n=1;
          break;
case 'V': n=5;
          break;
case 'X': n=10;
          break;
case 'L': n=50;
          break;
case 'C': n=100;
          break;
case 'D': n=500;
          break;
case 'M': n=1000;
          break;
}
return n;
}
}