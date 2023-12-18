import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    long answer =0;
    long H[] = new long[N];
    for(int i=0;i<N;i++){
      H[i]=sc.nextLong();
    }
    if(N<=K){
      System.out.println(0);
      return;
    }
    Arrays.sort(H);
    for(int i=0;i<N-K;i++){
      answer = answer+H[i];
    }
    System.out.println(answer);
  }
}