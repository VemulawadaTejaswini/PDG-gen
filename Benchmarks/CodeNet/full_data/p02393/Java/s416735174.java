import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    
    int[] sort = {a ,b ,c};
    Arrays.sort(sort);
      
    System.out.println(sort[0] + " " + sort[1] + " " + sort[2]);
  }
}