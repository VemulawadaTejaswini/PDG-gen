import java.util.Scanner;
import java.util.InputMismatchException;

class Main{
public static void Main(String args[]){
Scanner scanner1 = new Scanner(System.in);
Scanner scanner2 = new Scanner(System.in);
int a = scanner1.nextInt();
int b = scanner2.nextInt();
System.out.print(a*b);
System.out.print(" ");
System.out.print(2*a+2*b);
}
}