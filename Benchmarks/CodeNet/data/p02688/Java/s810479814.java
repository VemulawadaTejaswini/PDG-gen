import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    final int N = sc.nextInt();
    final int K = sc.nextInt();
    int S[] = new int[N];
    for(int i=0;i<K;i++) {
    	int d = sc.nextInt();
    	for(int j=0;j<d;j++) {
    		int a = sc.nextInt();
    		S[a-1]++;
    	}
    }
    sc.close();
    int ans = 0;
    for(int a : S) {
    	if(a==0) {
    		ans++;
    	}
    }
    System.out.println(ans);
  }
}