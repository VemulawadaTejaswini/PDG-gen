import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Integer[] ary = new Integer[n];
		int total = 0;
		for(int i=0; i<n; i++){
			ary[i] = sc.nextInt();
			total += ary[i];
		}
		Arrays.sort(ary, Comparator.reverseOrder());
		if(ary[m-1] > total/(4*m)){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
