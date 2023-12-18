import java.util.Scanner;
import java.io.*;

public class Main {
public static void main(String args[]) {
Scanner cro=new Scanner(System.in);
BufferedReader c=new BufferedReader(new InputStreamReader(System.in));
String s,s1;
int A,B,i,C;
C=0;
A=cro.nextInt();
B=cro.nextInt();
s1=cro.nextLine();
s=cro.nextLine();
for(i=0;i<A;i++) if(Character.isDigit(s.charAt(i))) C++;
if(s.charAt(A)=='-') C++;
for(i=A+1;i<A+B+1;i++) if(Character.isDigit(s.charAt(i))) C++;
if(C==A+B+1) System.out.println("Yes");
else System.out.println("No");
}   
}