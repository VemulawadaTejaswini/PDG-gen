import java.util.Scanner;

public class Main {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();

    int toshi = 13;
    int toshi2 = 5;
    int kakaku = 0;

    if (A >= toshi) {
    	kakaku = B;
    } else if (A < toshi && A > toshi2){
    	kakaku =  B/2;
    }

    System.out.println(kakaku);

  }

}