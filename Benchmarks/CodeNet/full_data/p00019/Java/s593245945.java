import java.util.Scanner;
 
public class Main {
public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
int n = scn.nextInt();
long x = 1;
for (int i = 2; i <= n; i++) {
x = x * i;
}
System.out.println(x);
}
}