
import java.util.Scanner;

class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();

    int sum1 = A + B ;
    int sum2 = B + C ;
    int sum3 = C + A ;

    if (sum1 == sum2 && sum2 == sum3){
      System.out.println(sum1);
    }

    if (sum1 < sum2 && sum1 < sum3){
    System.out.println(sum1);
    }
    if (sum2 < sum1 && sum2 < sum3){
    System.out.println(sum2);
    }
    if (sum3 < sum2 && sum3 < sum1){
    System.out.println(sum3) ;
    }

  }
}
