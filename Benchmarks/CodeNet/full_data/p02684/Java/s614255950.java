import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long K = sc.nextLong();
    int[] A = new int[N];
    for(int i=0;i<N;i++) {
    	A[i] = sc.nextInt();
    }
    int i = 0;
    int next = 0;
    for(long c=K;c>0;c--) {
    	next = A[next]-1;
    	System.out.println("next : "+next);
    }
    System.out.println(next+1);
    
  }
}