
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    // get a integer

    int a = sc.nextInt();
//    System.out.println(" integer is " + N);
    int b = sc.nextInt();
    int digitOfB = (int) (Math.log10(b) +1);
    int concatenationOfAb = (int) (a * Math.pow( 10, digitOfB ) + b);
    int sqrt =(int) Math.sqrt(concatenationOfAb);
    if(sqrt*sqrt == concatenationOfAb ){
      System.out.print("Yes");
    }else {
      System.out.print("No");
    }

  };

}
