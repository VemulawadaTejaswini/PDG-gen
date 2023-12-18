import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long y = 100;
    int n = 0;
    while(x>y) {
    	y *=1.01;
    	n++;
    }
    System.out.println(n);
  }
}