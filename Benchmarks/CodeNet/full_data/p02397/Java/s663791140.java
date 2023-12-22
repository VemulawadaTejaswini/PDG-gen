import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner scan=new Scanner(Sysytem.in);
while(true){
String A=scan.next();
String B=scan.next();
int a=integer.parseInt(A);
int b=integer.parseInt(B);
int okiba;
if(a>b){
okiba=a;
a=b;
b=okiba;
}
System.out.println(a+" "+b);
}
}
}