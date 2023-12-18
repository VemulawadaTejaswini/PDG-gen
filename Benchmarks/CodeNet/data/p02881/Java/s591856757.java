import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    long N = sc.nextLong();
    long min = N - 1;

    for(long i = 1; i <= N / 2; i++){
      if(N % i == 0){
        if(min > (i - 1) + (N/i - 1)){
          min = (i - 1) + (N/i - 1);
        }
      }
    }

    System.out.println(min);
  }
}