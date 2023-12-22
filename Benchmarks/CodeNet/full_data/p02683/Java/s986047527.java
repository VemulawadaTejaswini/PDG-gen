import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int M = sc.nextInt();
    	int X = sc.nextInt();
    	int[] c = new int[N];
    	int[][] a = new int[N][M];
    	for(int i = 0; i < N; i++){
    		c[i] = sc.nextInt();
    		for(int j = 0; j < M; j++){
    			a[i][j] = sc.nextInt();
    		}
    	}
    	sc.close();
    	int ans = Integer.MAX_VALUE;
    	for(int mask = 0; mask < Math.pow(2, N); mask++){
    		int[] d = new int[M];
    		int tmp = 0;
    		for(int i = 0; i < N; i++){
    			if(((mask >> i) & 1) == 1){
    				tmp += c[i];
    				for(int j = 0; j < M; j++){
    					d[j] += a[i][j];
    				}
    			}
    		}
    		boolean ck = true;
    		for(int i = 0; i < M; i++){
    			if(d[i] < X) ck = false;
    		}
    		if(ck){
    			ans = Math.min(ans, tmp);
    		}
    	}
    	System.out.println(ans == Integer.MAX_VALUE?-1:ans);
    }
}