import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int M = sc.nextInt();
    	int X = sc.nextInt();
    	int[][] book = new int[N][M+2];
    	for(int i = 0; i < N; i++){
    		book[i][M+1] = sc.nextInt();
    		for(int j = 1; j <= M; j++){
    			book[i][j] = sc.nextInt();
    			book[i][0] += book[i][j];
    		}
    	}
    	sc.close();
    	int ans = 0;
    	Arrays.sort(book, (s, t) -> Integer.compare(s[0],t[0]));
    	int[] skil = new int[M+1];
    	skil[0] = X;
    	for(int i = N-1; i >= 0; i--){
    		for(int j = 1; j <= M; j++){
    			skil[j] += book[i][j];
        	}
    		ans += book[i][M+1];
    		boolean flg = true;
    		for(int j = 1; j <= M; j++){
    			if(skil[j] < X) flg = false;
        	}
    		if(flg){
    			System.out.println(ans);
    			return;
    		}
    	}
    	System.out.println(-1);
    }
}