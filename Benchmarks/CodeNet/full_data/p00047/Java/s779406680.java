import java.io.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
int[] ball={1,0,0};
while((line=br.readLine())!=null){
char[] c=line.toCharArray();
reverse(c[0],c[2],ball);
}
for(int i=0;i<ball.length;i++){
if(ball[i]==1){
System.out.println(String.valueOf((char)('A'+1)));
}
}
}
private static void reverse(char c1,char c2,final int[] ball){
int a=ball[c1-'A'+1];
ball[c1-'A'+1]=ball[c2-'A'+1];
ball[c2-'A'+1]=a;
}
}