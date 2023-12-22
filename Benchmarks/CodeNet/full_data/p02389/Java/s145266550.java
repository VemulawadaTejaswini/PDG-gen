import java.io.*;
 
public class Main{
public static void main(String [] args){
InputStreamReader is = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(is);
String work = br.readLine();
String[] array = work.split(" ");
int a = Integer.parseInt(array[0]);
int b = Integer.parseInt(array[1]);
System.out.println((a * b) + " " + (a * 2 + b * 2));
}
}