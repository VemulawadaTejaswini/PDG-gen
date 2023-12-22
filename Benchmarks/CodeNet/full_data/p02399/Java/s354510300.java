import java.util.Scanner;
public class Main{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
double x=scan.nextInt();
double y=scan.nextInt();
double a=x/y;
double b=x%y;
double c=x/y;
int n=(int) a;
int m=(int) b;
System.out.print(n+" "+m+" ");
System.out.printf("%.5f",c);
}
}

