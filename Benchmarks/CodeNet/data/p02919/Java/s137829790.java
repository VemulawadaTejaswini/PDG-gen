import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] pos = new int[n+1];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			pos[arr[i]] = i;
		}
		int[] L = new int[n+1];
		int[] R = new int[n+1];
		TreeSet<Integer> set = new TreeSet<>();
		L[n] = pos[n]+1;
		R[n] = n - pos[n];
		set.add(pos[n]);
		long res = 0;
		for(int k = n-1; k >= 1; k--) {
			Integer left = set.lower(pos[k]);
			Integer right = set.higher(pos[k]);
			if(left == null) {
				L[k] = pos[k]+1;
			}
			else {
				L[k] = pos[k] - left;
				R[arr[left]] = L[k];
			}
			if(right == null) {
				R[k] = n - pos[k];
			}
			else {
				R[k] = right - pos[k];
				L[arr[right]] = R[k];
			}
			
			if(left != null) {
				res += ((long)k)*((long)L[arr[left]])*((long)R[k]);
			}
			if(right != null) {
				res += ((long)k)*((long)L[k])*((long)R[arr[right]]);
			}
			set.add(pos[k]);
		}
		System.out.println(res);
	}

}
