
import java.util.Scanner;

class cake {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    int A , B , X ;   //1≤A,B≤1,000
                      //A+B≤X≤10,000
                      //X,A,B は整数である

    X = stdIn.nextInt();

    A = stdIn.nextInt();

    B = stdIn.nextInt();

    X = X - A;
    for (; X >= B ; ) {
      X = X - B;
    }
    System.out.println(X);
  }
}
