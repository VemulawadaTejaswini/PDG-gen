import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextByte();
    int y = sc.nextByte();
    sc.close();
    if((y & 1) == 0) {
      int t = (y/2) - x;
      int c = x - t;
      if(c < 0 || t < 0) {
        System.out.println("No");
      } else {
        if(((4*t) + (2*c)) == y) System.out.println("Yes");
      }
    } else {
      System.out.println("No");    
    }
  }
}