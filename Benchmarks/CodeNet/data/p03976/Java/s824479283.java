import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] initial = new int[26];

		for(int i=0; i<n; i++){
			String s = sc.next();
			initial[s.charAt(0)-'A']++;
		}

		Arrays.sort(initial);

		if((n%k==0)? n/k : (n/k)+1 <= initial[25]){
			System.out.println(0);
		}else{
			System.out.println(n/k);
		}
	}
}