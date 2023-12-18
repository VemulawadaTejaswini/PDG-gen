import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long K = sc.nextLong();
    long res = N-K;
    long answer=0;

    answer+=(res/K+1)*(res/K+1)*(res/K+1);
    if(K%2==0){
      long res_2 = N-K/2;
      answer+=(res_2/K+1)*(res_2/K+1)*(res_2/K+1);
    }
  System.out.println(answer);
  }
}
