import java.util.*;

public class Main {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int A = sc.nextInt();
    int B = sc.nextInt();

    if (A<10 && B<10){
      return A*B;
    }else{
      return -1;
    }

  }
}
