import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    long K = sc.nextLong();
    long P = 0L;
    long Dif = 1L;

    for(int i = 1; i <= K; i++){
      P += Dif;
      if(helper(P + Dif) > helper(P + 2 * Dif))
      Dif *= 10L;
      System.out.println(P);
    }
  }
  public static double helper(long n){
    double S = (double) n;
    double sum = 0.0;
    while(n != 0){
      sum += (double) n%10;
      n = n/10;
    }
    return S/sum;
  }
}
