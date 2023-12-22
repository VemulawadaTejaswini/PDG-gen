import java.util.Scanner;
 
public class Main {
public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
int n = scn.nextInt();
int a = 100;
for (int i = 0; i < n; i++) {
a = Math.ceil(a * 1.05);
}
System.out.println(a * 1000);
}
}