import java.util.*;


public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int sum = 0;
		int list[] = new int[n];
		for (int i = 0; i < n; i++) {
		    list[i] = sc.nextInt();
		}
		Arrays.sort(list);
		
		for (int i =0; i < k; i++) {
		    sum += list[i];
		}
		System.out.println(sum);
    }
}
