import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(qtyCandy(sc.nextInt()));
    sc.close();

  }
  static int qtyCandy(int n){
    if(n == 0) {
      return 0;
    } else {
      return  n + qtyCandy(n - 1);
    }
  }
}
