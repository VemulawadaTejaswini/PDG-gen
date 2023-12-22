import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  while (true) {
   int i = sc.nextInt();
   int x = i;
   if (x%3 == 0 || x%10 == 3) {
    System.out.printf(i);
   }
   System.out.ptintf("\n");
  }
 }
}