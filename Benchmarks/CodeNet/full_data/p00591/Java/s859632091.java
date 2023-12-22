import java.util.*;

public class Main{

    int n;
    int[][] T, H;
    public Main(){
	Scanner sc = new Scanner(System.in);


	while(true){
	    n = sc.nextInt();
	    if ( n == 0 ) break;
	    T = new int[n][n];
	    H = new int[n][n];
	    for ( int i = 0; i < n; i++ ){
		for ( int j = 0; j < n; j++ ){
		    T[i][j] = sc.nextInt();
		    H[i][j] = 0;
		}
	    }
	    for ( int a = 0; a < n; a++ ){
		int minv = getMin(a);
		int maxv = getMax(a);
		for ( int b = 0; b < n; b++ ){
		    if ( T[a][b]  == minv ) H[a][b]++;
		    if ( T[b][a] == maxv ) H[b][a]++;
		}
	    }

	    int ans = 0;
	    for ( int i = 0; i < n; i++ ){
		for ( int j = 0; j < n; j++ ){
		    if ( H[i][j] == 2 ) ans = T[i][j];
		}
	    }
	    System.out.println(ans);
	}
    }

    int getMax(int j){
	int maxv = 0;
	for ( int i = 0; i < n; i++ ){
	    if ( maxv < T[i][j] ) {
		maxv = T[i][j];
	    }
	}
	return maxv;
    }
    
    int getMin(int i){
	int minv = Integer.MAX_VALUE;
	for ( int j = 0; j < n; j++ ){
	    if ( minv > T[i][j] ) {
		minv = T[i][j];
	    }
	}
	return minv;
    }

    public static void main(String[] args){
	new Main();
    }
}