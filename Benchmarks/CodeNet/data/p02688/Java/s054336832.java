import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int K = sc.nextInt();
    	boolean[] sunuke = new boolean[N];
    	for (int i = 0; i < K; i++) {
    		int d = sc.nextInt();
        	for (int j = 0; j < d; j++) {
        		sunuke[sc.nextInt() - 1] = true;
        	}
        }
    	int sum = 0;
    	for(int i = 0; i < N; i++) {
    		if(!sunuke[i])sum++;
    	}
    	System.out.println(sum);
    }
}