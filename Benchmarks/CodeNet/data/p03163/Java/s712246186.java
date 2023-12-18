public class Main{

	public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
		
	    int n = Integer.parseInt(sc.next());
	    int w = Integer.parseInt(sc.next());
	    
	    long[][] matriz = new long[n+1][w+1];
	    int[] p = new int[n];
	    int[] v = new int[n];
	    
	    for(int i = 0; i <= n; i++) {
	      for(int j = 0; j <= w; j++) {
	        matriz[i][j] = 0;
	      }
	    }
	    
	    for(int i = 0; i < n; i++) {
	      p[i] = Integer.parseInt(sc.next());
	      v[i] = Integer.parseInt(sc.next());
	    }
	    
	    for(int i = 0; i < n; i++) {
	      for(int j = 0; j <= w; j++) {
	        matriz[i + 1][j] = matriz[i][j];
	        if(j >= p[i]) {
	          matriz[i+1][j] = Math.max(matriz[i + 1][j], matriz[i][j - p[i]] + v[i]);
	        }
	      }
	    }
	    
	    System.out.println(matriz[n][w]);

	}

}
