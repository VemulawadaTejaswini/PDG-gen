import java.util.Scanner;

class Main{
public static void main(String[] args){

 int a;
 int b;
int c;

Scanner s = new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
if(a<b){int x=a;a=b;b=x;}
if(b<c){int t =b;b=c;c=t;}
if(a<c){int o=a;a=c; c=o; }
System.out.println(c+" "+b+" "+a);
}
}
		

