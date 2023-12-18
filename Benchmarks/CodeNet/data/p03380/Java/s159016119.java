import java.util.*;

public class Main {
    public static void main(String[] args) {	
	Main main = new Main();
    	main.solveD();
    }
    
    private void solveA() {
    	Scanner sc = new Scanner(System.in);
    	int A = sc.nextInt();
    	int B = sc.nextInt();
	int X = sc.nextInt();	
    	System.out.println(A > X ? "NO" : (A+B >= X ? "YES" : "NO"));
    }

    private void solveB() {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
    	int M = sc.nextInt();
	int X = sc.nextInt();

	int[] a = new int[M];

	for(int i=0; i < M; i++){
	    a[i] = sc.nextInt();	    
	}

	int ans1=0;
	for(int i=X; i > 0; i--){
	    for(int j=0; j < M; j++){
		if (a[j] == i) ans1++;	    
	    }
	}

	int ans2=0;
	for(int i=X; i < N; i++){
	    for(int j=0; j < M; j++){
		if (a[j] == i) ans2++;	    
	    }
	}
	System.out.println(Math.min(ans1,ans2));
    }
    private void solveC() {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int[] X = new int[N];
	int[] Y = new int[N];

	for(int i=0; i < N; i++){
	    X[i] = sc.nextInt();	    
	}

	for(int i=0; i < N; i++){
	    Y[i] = X[i];	    
	}

	Arrays.sort(X);

	int ans1 = X[N/2 -1];
	int ans2 = X[N/2];

	for(int i=0; i < N; i++){
	    if (Y[i]<=ans1) System.out.println(ans2);
	    else System.out.println(ans1);
	}
       
    }
    private void solveD() {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] a = new int[n];
	
	for(int i=0; i < n; i++){
	    a[i] = sc.nextInt();	    
	}

	int max = a[0];
	for (int i=0;i<n;i++){
	    if (a[i]>max) max=a[i];
	}

	int m;
	if (max%2 == 0) m = max/2;
	else m = (max+1)/2;
	
	int ans = 0;
	int d = m;
	for (int i=0;i<n;i++){
	    int delta = Math.abs(m-a[i]);
	    if (delta < d) {
		d=delta;
		ans = a[i];
	    }
	}
	System.out.println(max+" "+ans);
    }
	
}