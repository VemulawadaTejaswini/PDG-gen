import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    final int N=sc.nextInt();
    final int K=sc.nextInt();
    int[] h=new int[N];
    for(int i=0;i<N;i++){
      h[0]=sc.nextInt();
    }
    Arrays.sort(h);
    int min=0;
    for(int i=0;i<N-K;i++){
      int dif=h[i+K]-h[i];
      if(min>dif){
        min=dif;
      }
    }
    System.out.println(min);
  }
}