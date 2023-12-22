import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int left = 1, right = n;
		Set<Integer> used = new HashSet<>();
		while(m > 0) {
			int step = n - right + 1;
			if(left + step == right || used.contains(right - left)) {
				right--;
				continue;
			}
			System.out.println(left + " " + right);
			used.add(right - left);
			left++;
			right--;
			m--;
		}
    }
}