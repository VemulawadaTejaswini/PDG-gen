import java.io.*;
class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str=br.readLine();
String[] arr=str.split(" ");
int a=Integer.parseInt(arr[0]);
int b=Integer.parseInt(arr[1]);
int d=a/b;
int r=a%b;
float fa=Float.parseFloat(arr[0]);
float fb=Float.parseFloat(arr[1]);
float f=fa/fb;
String ansf=String.format("%.5f",f);
System.out.println(d+" "+r+" "+ansf);
br.close();
}
}