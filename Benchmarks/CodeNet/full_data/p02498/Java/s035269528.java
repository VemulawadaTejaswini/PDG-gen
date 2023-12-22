import java.io.*;

class Main{
public static void main(String[] args) throws IOException{

InputStreamReader is = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(is);


String str = br.readLine();
String ans;
for(int i = 0; i < str.length(); i++){
if(str.codePointAt(i) >= 65 && str.codePointAt(i) <= 90){
int c = str.codePointAt(i) + 32;
 System.out.print((char)c);}
else if(str.codePointAt(i) >= 97 && str.codePointAt(i) <= 122){
 int c = str.codePointAt(i) - 32;
 System.out.print((char)c);
}
else
System.out.print((char)str.codePointAt(i));
}
System.out.println();
}
}