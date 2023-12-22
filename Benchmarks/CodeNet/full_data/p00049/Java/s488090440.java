import java.io.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
int a=0;
int b=0;
int ab=0;
int o=0;
while((line=br.readLine())!=null){
String str=line.substring(line.indexOf(",")+1);
if(str.equals("A")){
a++;
}
if(str.equals("B")){
b++;
}
if(str.equals("AB")){
ab++;
}
if(str.equals("O")){
o++;
}
}
System.out.printf("%d\n%d\n%d\n%d/n",a,b,ab,o);
}
}