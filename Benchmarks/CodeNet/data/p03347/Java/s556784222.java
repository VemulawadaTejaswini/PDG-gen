import java.util.*;

public class Main {

  public static void main(String args[]) {
    (new Main()).solve();
  }

  void solve() {

    Scanner cin = new Scanner(System.in);

    int N = cin.nextInt();
    int array[] = new int[N];
    
    for(int i = 0; i < N; ++i ) {
    	array[i] = cin.nextInt();
    }
    
    int ans = 0;
    boolean add = true;
    for( int i = N - 1; i >= 0; --i ) {
    	if( array[i] == 0 ) {
    		add = true;
    		continue;
		}
    	if( add ) {
    		ans += array[i];
    	}
    	// failed...;
    	if( i == 0 ) {
    		ans = -1;
    		break;
    	}
    	if( array[i - 1] < array[i] - 1 ) {
    		ans = -1;
    		break;
    	}
    	if( array[i - 1] == array[i] - 1 ) {
    		add = false;
    	}
    	else {
    		add = true;
    	}
    }

	System.out.println(ans);
    
    cin.close();

  }

}
