import java.io.*;
public class Main{
   public static void main(String[] args)throws IOException{
InputStreamReader is = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(is);

while(true){
String str = br.readLine();

int space1 = str.indexOf(" ");
int space2 = str.indexOf(" ", space1+1);
String str1 = str.substring(0, space1);
String str2 = str.substring(space1+1, space2);
String str3 = str.substring(space2+1, str.length());
int a = Integer.parseInt(str1);
int c = Integer.parseInt(str3);
int ans = 0;
if(str2.equals("+"))
 ans = a+c;
else if(str2.equals("-"))
 ans = a-c;
else if(str2.equals("*"))
 ans = a*c;
else if(str2.equals("/"))
 ans = a/c;
else if(str2.equals("?"))
 break;
System.out.println(ans);
}
}
}