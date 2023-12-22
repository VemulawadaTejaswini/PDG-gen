import java.util.*;

class Main {
	public static int[] xs = {1, 0, -1, 0};
	public static int[] ys = {0, 1, 0, -1};
	public static int[][] w;
	public static boolean[][] bools;
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	int n = Integer.parseInt(sc.nextLine());
    	int[] p = new int[n*n];
    	w = new int[n+2][n+2];
    	bools = new boolean[n+2][n+2];
    	int roop = n+2 -(n+2)/2;
    	for(int i = 1; i < roop; i++) {
    		for(int j = i; j < roop; j++) {
    			w[i][j] = i;
    			w[i][n+1-j] = i;
    			w[n+1-i][j] = i;
    			w[n+1-i][n+1-j] = i;
    			w[j][i] = i;
    			w[j][n+1-i] = i;
    			w[n+1-j][i] = i;
    			w[n+1-j][n+1-i] = i;
    		}
    	}
    	for(int i = 0; i < n*n; i++) {
    		p[i] = sc.nextInt() - 1;
    	}
    	int sum = 0;
    	for(int i = 0; i < n*n ; i++) {
    		int x = p[i] % n + 1;
    		int y = p[i] / n + 1;
    		int k = w[x][y];
    		sum += k;
    		bools[x][y] = true;
    		update(x, y);
    	}
    	
    	System.out.println(sum - n*n);
    }
	
	private static void update(int x, int y){
		int z = w[x][y];
		if(!bools[x][y]) {
			z++;
		}
		for(int i = 0; i < 4; i++){
			int x2 = x + xs[i];
			int y2 = y + ys[i];
			if(w[x2][y2] > z) {
				w[x2][y2] = z;
				update(x2, y2);
			}
		}
	}
}