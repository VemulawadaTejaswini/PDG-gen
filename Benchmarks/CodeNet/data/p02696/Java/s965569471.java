import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long n = sc.nextLong();
    long x = 0;
    long y = 0;

    for(int i=0;i<n+1;i++) {
    	x = (a*i)/b-a*(i/b);
    	y = Math.max(x, y);
    }
    System.out.println(y);
  }
}