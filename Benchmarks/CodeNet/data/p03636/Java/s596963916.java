import java.util.Scanner;
public class Main{
public static void main(String [] args){
Scanner in=new Scanner (System.in);
String a=in.next();
int N=a.length();
System.out.println("'+a.charAt(0)+(N-2)+a.charAt(N-1));
}
}