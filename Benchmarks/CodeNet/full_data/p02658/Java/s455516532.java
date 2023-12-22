import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long acum = 1;
    boolean cs = false;
    for(int i = 0; i < n; i++) {
      try {
        acum = Math.multiplyExact(acum, sc.nextLong());      
      } catch(ArithmeticException e) {
        cs = true;
      }
    }
    sc.close();
    if(acum != 0 && (acum > 1000000000000000000L || cs)) {
      System.out.println("-1");
    } else {
      System.out.println(acum);
    }
  }
}