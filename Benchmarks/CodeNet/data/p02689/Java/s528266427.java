import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int H[] = new int[N];
    int ma[] = new int[N];
    for(int i=1;i<=N;i++) {
    	H[i] = sc.nextInt();
    	ma[i] = 0;
    }
    for(int i=0;i<M;i++) {
    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	ma[A] = Math.max(ma[A], H[B]);
    	ma[B] = Math.max(ma[B], H[A]);
    }
    int ans = 0;
    for(int i=1;i<=N;i++) {
    	if(H[i]>ma[i]) {
    		ans++;
    	}
    }
    System.out.println(ans);
  }
}