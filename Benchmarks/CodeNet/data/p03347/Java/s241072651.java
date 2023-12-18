import java.util.*;

public class Main {

  public static void main(String args[]) {
    (new Main()).solve();
  }

  void solve() {

    Scanner cin = new Scanner(System.in);

    int N = cin.nextInt();
    int array[] = new int[N + 1];
    
    for(int i = 0; i < N; ++i ) {
    	array[i] = cin.nextInt();
    }
    
    long ans = 0;
    for( int i = N; i >= 0; --i ) {
    	if( i == 0 ) {
    		if( array[i] > 0 ) {
    			ans = -1;
    		}
    		break;
    	}
    	if( array[i - 1] < array[i] - 1 ) {
    		ans = -1;
    		break;
    	}
    	if( array[i - 1] >= array[i] ) {
    		ans += array[i - 1];
    	}
    }

	System.out.println(ans);
    
    cin.close();

  }

}
