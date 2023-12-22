import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int counter = 0;
		int n = sc.nextInt();
		int[] s = new int [n];
		for(int i = 0; i < n; i++){
			s[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		int[] t = new int [q];
		for(int i = 0; i < q; i++){
			t[i] = sc.nextInt();
		}
		Arrays.sort(s);
		Arrays.sort(t);
		for(int i = 0; i < q; i++){
			for(int j = i; j < n; j++){
				if(t[i] == s[j]){
					counter++;
					break;
				}
			}
		}
		System.out.println(counter);
	}
}