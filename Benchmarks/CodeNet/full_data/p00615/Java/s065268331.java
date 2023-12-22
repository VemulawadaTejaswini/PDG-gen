import java.util.*;

class Main {

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		for(;;){
			int n = in.nextInt(), m = in.nextInt();
			if( n==0 && m==0 ) break;
			int ts[] = new int [n+m+1], difs[] = new int [n+m];
			for(int i=0; i<n+m; i++) ts[i] = in.nextInt();
			ts[n+m] = 0;
			Arrays.sort(ts);
			for(int i=0; i<n+m; i++) difs[i] = ts[i+1] - ts[i];
			Arrays.sort(difs);
			System.out.println(difs[n+m-1]);
		}
	}

}