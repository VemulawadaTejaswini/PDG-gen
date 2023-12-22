import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] H = new int[N];
        int count = 0;
        for (int i = 0; i < N; i++) {
        	H[i] = sc.nextInt();
        }
        Set<int[]> set = new HashSet<>();
        for (int i = 0; i < M; i++) {
        	int[] ar = new int[2];
        	int A1 = sc.nextInt();
        	int B1 = sc.nextInt();
        	if (B1 < A1) {
        		int tmp = A1;
        		A1 = B1;
        		B1 = tmp;
        	}
        	ar[0] = A1;
        	ar[1] = B1;
        	set.add(ar);
        }
        for (int i = 0; i < N; i++) {
        	boolean key = true;
        	for (int[] ar : set) {
        		if (ar[0] == i + 1) {
        			if (H[i] <= H[ar[1] - 1]) {
        				key = false;
        			}
        		} else if (ar[1] == i + 1) {
        			if (H[i] <= H[ar[0] - 1]) {
        				key = false;
        		    } 
        		}
        	}
        	if (key) {
        		count++;
        	}
        		
        }
        System.out.println(count);
    }
}