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
switch(str){
case "A":a++;
         break;
case "B":b++;
         break;
case "AB":ab++;
          break;
case "O":o++;
         break;
}
}
System.out.printf("%d\n%d\n%d\n%d",a,b,ab,o);
}
}