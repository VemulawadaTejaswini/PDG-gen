import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");
//    	Scanner sc = new Scanner(file);

    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int M = sc.nextInt();
    	int[] H = new int[N];
    	int[] A = new int[M];
    	int[] B = new int[M];
    	for(int i=0;i<N;i++) {
    		H[i] = sc.nextInt();
    	}
    	for(int i=0;i<M;i++) {
    		A[i] = sc.nextInt();
    		B[i] = sc.nextInt();
    	}
    	int ans = 0;
    	for(int i=0;i<N;i++) {
    		boolean flg = true;
    		int h = H[i];
    		//Aに入っている場合
    		for(int j=0;j<M;j++) {
    			if(A[j]==i) {
    				int h2 = H[B[j]-1];
    				if(h2>h) {
    					flg = false;
    				}
    			}
    		}
    		for(int j=0;j<M;j++) {
    			if(B[j]==i) {
    				int h2 = H[A[j]-1];
    				if(h2>h) {
    					flg = false;
    				}
    			}
    		}
    		if(flg) {
    			ans ++;
    		}

    	}
    	System.out.println(ans);
    }
}