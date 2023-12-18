import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	int M = sc.nextInt();
    	int[] fr = new int[A];
    	int minF = Integer.MAX_VALUE;
    	for (int i = 0; i < A; i++) {
    		fr[i] = sc.nextInt();
    		if (fr[i] < minF) {
    			minF = fr[i];
    		}
    	}
    	int minR = Integer.MAX_VALUE;
    	int[] ra = new int[B];
    	for (int i = 0; i < B; i++) {
    		ra[i] = sc.nextInt();
    		if (ra[i] < minR) {
    			minR = ra[i];
    		}
    	}
    	int ans = minF + minR;
    	List<int[]> cpList = new ArrayList<>();
    	for (int i = 0; i < M; i++) {
    		int[] cp = new int[3];
    		cp[0] = sc.nextInt() - 1;
    		cp[1] = sc.nextInt() - 1;
    		cp[2] = sc.nextInt();
    		cpList.add(cp);
    	}
    	for (int[] cp : cpList) {
    		int val = fr[cp[0]] + ra[cp[1]] - cp[2];
    		if (val < ans) {
    			ans = val;
    		}
    	}
    	System.out.println(ans);

    }
}