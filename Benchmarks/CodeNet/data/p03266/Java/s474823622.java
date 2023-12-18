import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int res = N-K;
    int answer=0;

    answer+=(res/K+1)*(res/K+1)*(res/K+1);
    if(K%2==0){
      int res_2 = N-K/2;
      answer+=(res_2/K+1)*(res_2/K+1)*(res_2/K+1);
    }
  System.out.println(answer);
  }
}
