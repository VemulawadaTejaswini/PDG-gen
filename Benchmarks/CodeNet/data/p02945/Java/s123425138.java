import java.util.Scanner;

private static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  
  int a = scan.nextInt(), b = scan.nextInt();
  
  System.out.println(Math.max(a + b, Math.max(a - b, a * b)));
}