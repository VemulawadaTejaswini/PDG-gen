import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] L = new int[N];
		int max = -1;
		int maxI = -1;
		for (int i = 0; i < N; i++) {
		    L[i] = sc.nextInt();
		    if (max < L[i]) {
		        max = L[i];
		        maxI = i;
		    }
		}
		
		int sumExcludedMax = 0;
		for (int i = 0; i < N; i++) {
		    if (i == maxI) continue;
		    sumExcludedMax += L[i];
		}
		
		if (max < sumExcludedMax) {
		    System.out.println("Yes");
		} else {
		    System.out.println("No");
		}
	}
}