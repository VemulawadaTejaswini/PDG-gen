import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner scan= new Scanner(System.in);
String A=scan.next();
String B=scan.next();
String C=scan.next();
String D=scan.next();
String E=scan.next();
int a=Integer.parseInt(A);
int b=Integer.parseInt(B);
int c=Integer.parseInt(C);
int d=Integer.parseInt(D);
int e=Integer.parseInt(E);
if(a>=c+e&&b>=d+e&&c-e>=0&&d-e>=0)
System.out.println("Yes");
else
System.out.println("No");
}
}