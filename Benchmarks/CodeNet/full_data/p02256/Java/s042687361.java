import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    if(a < b){
      int c = a;
      a = b;
      b = c;
    }

    while(b > 0){
      int r = a % b;
      a = b;
      b = r;
    }

    System.out.println(a);

    sc.close();
  }
}
