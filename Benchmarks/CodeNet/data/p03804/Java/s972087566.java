import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int M = sc.nextInt();
	int[][] a = new int[N][N];
	int[][] b = new int[M][M];
	for(int i = 0; i<N; i++) {
	    String str = sc.next();
	    for(int j = 0; j<N; j++) {
		char c = str.charAt(j);
		if(c=='.') a[i][j] = 1;
		else a[i][j] = 0;
	    }
	}
	for(int i = 0; i<M; i++) {
            String str = sc.next();
            for(int j = 0; j<M; j++) {
		char c = str.charAt(j);
		if(c=='.') b[i][j] = 1;
		else b[i][j] = 0;
            }
        }

	int cnt = M;
	while(cnt<=N) {
	    for(int i = 0; i<M; i++) {
		for(int j = 0; j<M; j++) {
		    if(i == M-1 && j==M-1 && a[i][j] == b[i][j]) {
			System.out.println("Yes");
			return;
		    }
		    if(a[i][j] == b[i][j]) continue;
		    break;
		}
	    }
	    cnt++;
	}
	System.out.println("No");

    }
}