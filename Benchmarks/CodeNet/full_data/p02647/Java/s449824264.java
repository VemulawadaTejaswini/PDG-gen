import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int K = sc.nextInt();
	int[] A = new int[N+1];
	A[0] = 0;
	for (int i=1;i<=N;i++) {
	    A[i] = sc.nextInt();
	    boolean cc = true;
	    for (int j=1;j<=N;j++) {
		if (A[j] != N) cc=false;
	    }
	    if (cc) break;
	}
	for (int k=1;k<=K;k++) {
	    A = reA(A,N);
	}
	StringBuilder sb = new StringBuilder();
	for (int i=1;i<=N;i++) {
	    sb.append(A[i] + " ");
	}
	System.out.print(sb.toString());
    }
    static int[] reA(int[] A ,int N) {
	 int[] countL = new int[N+1];
	 for (int a=1;a<=N;a++) {
	     int str;
	     if (a-A[a] < 0) { str = 0;}
	     else { str = a-A[a]; }
	     int dst;
	     if (a+A[a] > N) { dst = N; }
	     else {dst = a+A[a]; }
	     
	     for (int ll=str; ll<=dst; ll++) {
		 countL[ll]++;
	     }
	 }
	 return countL;
    }
}
