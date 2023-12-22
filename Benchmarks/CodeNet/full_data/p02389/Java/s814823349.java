import java.util.Scanner;
class Main{
public static void main (String[] args){
Scanner scan = new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int squ=a*b;
int rect=2*a+2*b;
System.out.println(squ+"?\t"+rect);
}
}