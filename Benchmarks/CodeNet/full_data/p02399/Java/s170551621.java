import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner scan =new Scanner(System.in);

int a=scan.nextInt();
int b=scan.nextInt();
int c,d;
double e;
c=a/b;
d=a%b;
e=(double)a/(double)b;
System.out.print(c+" "+d+" ");
String after = String.format("%.16f", e);
 System.out.println(after);
}
}