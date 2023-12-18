import java.util*;

class main {
  public static void main(String[] args) {
    Scanner sca1 = new Scanner(System.in);
    Scanner sca2 = new Scanner(System.in);
    int a = sca1.nextInt();
    int b = sca2.nextInt();
    if((a*b)%2 == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }
  }
}