package aaa;
import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner scan =new Scanner(System.in);

int a=scan.nextInt();
int b=scan.nextInt();
int c,d;
float e;
c=a/b;
d=a%b;
e=(float)a/b;
System.out.println(c+" "+d+" "+e);
}
}