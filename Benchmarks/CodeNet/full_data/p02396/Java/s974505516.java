import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int count = 0;
  while(true) {
   count++;
   int input = sc.nextInt();
   if(input == 0) {
    break;
   } else {
    System.out.println("case " + count +": " + input);
  }
 }
}