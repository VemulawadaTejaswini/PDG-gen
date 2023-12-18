import java.util.Scanner;
import java.util.Arrays;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    long sum  =0;
    long[] HP = new long[N];
    for(int i=0; i<N; i++)
      HP[i] = sc.nextLong();
    
    if(K >= N)
      System.out.println(0);
    else{
        Arrays.sort(HP); //HPを少ない順にソート、多い順にK回消す
       for(int i = 0; i<N; i++){
         if(i >= K)  //例えばK=5のとき
            sum += HP[N-i-1];
       }
    }
    System.out.println(sum);
    
    
  }
}
