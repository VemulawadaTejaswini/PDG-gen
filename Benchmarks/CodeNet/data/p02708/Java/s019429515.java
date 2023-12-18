import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int P = 1000000007;
    int MAX = 100001;
    int N = sc.nextInt();
    int K = sc.nextInt();
    
    long ans =0;
    for(int i=K;i<=N+1;i++){
      //i番目の個数は(2*N+3-i)*i/2-(i-1)*i/2+1個
      ans=ans+(((2*N-i)*(i+1)/2)%P-((i-1)*i/2)%P+1)%P;
    }



    System.out.println(ans);


  }

}
 