import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    double sum = 0;
    for (int i = 0; i < N; i++) {
      sum+= (double)1/sc.nextInt();
    }


      System.out.println((double)1/sum);


  }

}
