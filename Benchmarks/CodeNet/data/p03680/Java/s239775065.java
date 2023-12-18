import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int next = 1;
		int[] a = new int[n];
		HashSet<Integer> hSet = new HashSet<>();

		for(int i = 0; i < n; i++){
			a[i] = scanner.nextInt();
		}

		for(int i = 0; i < n; i++){
			next = a[next-1];
			//System.out.println("next" + next);
			if(next == 2){
				System.out.println(i+1);
				return;
			}
			if(hSet.contains(next)){
				System.out.println(-1);
				return;
			}else {
				hSet.add(next);
			}

		}
	}
}