import java.util.* ;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
  int a = scan.nextInt();
    int b =scan.nextInt();
    int c = Math.max(a+b , a-b);
    System.out.println(Math.max(c,a*b));
  }
}
