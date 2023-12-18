import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner( System.in );
    int A = sc.nextInt();
    int B = sc.nextInt();
    int quot = B/A;
    int mod = B%A;
    
    if (mod > 0) {
      quot ++;
    }
    
    if (B >= (quot * (A-1)) + 1) {
      System.out.println(quot);
    } else {
      System.out.println(quot+1);
    }

  }
}