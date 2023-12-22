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
switch(c){
case I: return 1;
case V: return 5;
case X: return 10;
case L: return 50;
case C: return 100;
case D: return 500;
case M: return 1000;
}
}