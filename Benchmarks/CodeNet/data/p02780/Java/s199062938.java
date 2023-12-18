import java.util.Scanner;
import java.util.Arrays;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    long[] p = new long[N];
    long avg =0;
    for(int i=0; i<N; i++)
      p[i] = sc.nextLong();
    
	Arrays.sort(p);
    
    for(int i=0; i<K; i++){
    	long score = (p[N-1-i] + 1) /2.0;
         avg += score;
    }   
    System.out.println(avg);
  }
}
