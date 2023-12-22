import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double debt = 100000;
    debt *= 0.001;
    while(sc.hasNext()) {
      int n = sc.nextInt();
      for (int i = 0; i < n; i++) {
        debt *= 1.05;
        debt  = Math.ceil(debt);
      }
      System.out.println((int)debt*1000);
    }
  }
}