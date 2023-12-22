import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc= newScanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int area = a*b;
int length = a+a+b+b;
System.out.println(area + " " + length);
}
}