import java.util.*;

public class Main {

  public static void main(String args[]) {
    (new Main()).solve();
  }

  void solve() {

    Scanner cin = new Scanner(System.in);

    int N = cin.nextInt();
    int array[] = new int[N];
    
    for( int i = 0; i < N; ++i ) {
    	array[i] = cin.nextInt();
    }
    
    int ans = 1;;
    for( int i = 1; i <= N; ) {
    	int seq = 0;
    	for( int j = 0; j < N; ++j ) {
    		// found;
    		if( array[j] == i ) {
    			++seq;
    			++i;
    		}
    	}
    	ans = Math.max(ans, seq);
    }
    
    System.out.println(N - ans);

    cin.close();

  }

}
