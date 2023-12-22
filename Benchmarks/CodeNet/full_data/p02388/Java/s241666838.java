import java.io.*;
public class Main {
public static void main(String args[])
throws IOException{


BufferedReader in
= new BufferedReader???(new FileReader("foo.in"));???
String str=br.readLine();   
int x =Integer.parseInt(str) ;
   
   System.out.println(x*x*x);
}
}