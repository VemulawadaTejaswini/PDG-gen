import java.io.*;
class Main{
 public static void main(String[] args)throws IOException{

InputStreamReader is = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(is);

String str = br.readLine();
int space = str.indexOf(" ");
String str1 = str.substring(0, space);
String str2 = str.substring(space+1, str.length());

int a = Integer.parseInt(str1);
int b = Integer.parseInt(str2);
double c = Double.parseDouble(str1);
double d = Double.parseDouble(str2);


int a1 = a/b;
int a2 = a%b;
double a3 = c/d;

System.out.println(a1 + " " + a2 + " " + a3);


}
}