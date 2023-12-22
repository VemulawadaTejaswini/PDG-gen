import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
String A=scan.next();
String B=scan.next();
String C=scan.next();
int a=Integer.parseInt(A);
int b=Integer.parseInt(B);
int c=Integer.parseInt(C);
int okiba;
if(a>b){
okiba=a;
a=b;
b=okiba; 
}
if(b>c){
okiba=b;
b=c;
c=okiba; 
if(a>b){
okiba=a;
a=b;
b=okiba; 
}
}
System.out.println(a+" "+b+" "+c);
}
}