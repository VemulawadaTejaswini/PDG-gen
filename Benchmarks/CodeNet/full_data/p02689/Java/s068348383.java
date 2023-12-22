import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int M = sc.nextInt();
    	int[] H = new int[N];
    	boolean[] isBad = new boolean[N];
    	for (int i = 0; i < N; i++) {
    		H[i] = sc.nextInt();
        }
    	for(int i = 0; i < M; i++) {
    		int A = sc.nextInt() - 1;
    		int B = sc.nextInt() - 1;
    		int C = H[A] < H[B] ? A : B;
    		isBad[C] = true;
    		if(H[A] == H[B]){
    			isBad[A] = true;
    		}
    	}
    	
    	int sum = 0;
    	for(int i = 0; i < N; i++) {
    		if(!isBad[i])sum++;
    	}
    	System.out.println(sum);
    }
}