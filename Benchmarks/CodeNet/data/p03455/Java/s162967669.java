import java.util.Scanner;

public class Main {
  public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    // get a integer

    int a = sc.nextInt();
//    System.out.println(" integer is " + N);
    int b = sc.nextInt();
    int productOfAb = a*b;
    if(productOfAb %2 ==0){
      System.out.print("Even");
    }else {
      System.out.print("Odd");
    }

  };

}
