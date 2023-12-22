import java.io.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
int count=0;
while((line=br.readLine())!=null){
int a=0;
boolean f=false;
for(int i=0;i<line.length();i++){
f=false;
if(line.charAt(i)>='0'&&line.charAt(i)<='9'){
a=a*10+(int)(line.charAt(i)-'0');
f=true;
}
if(!f){
count+=a;
a=0;
}
}
}
System.out.println(count);
}
}