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
switch(i){
case 0:System.out.println("A");
       break;
case 1:System.out.println("B");
       break;
case 2:System.out.println("C");
       break;
}
break;
}
}
}
private static void reverse(char c1,char c2,final int[] ball){
int a=ball[c1-'A'];
ball[c1-'A']=ball[c2-'A'];
ball[c2-'A']=a;
}
}