import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		int n = sc.nextInt();
		int[] s = new int [n];
		for(int i = 0; i < n; i++){
			s[i] = sc.nextInt();
		}
		Arrays.sort(s);
		int q = sc.nextInt();
		for(int i = 0; i < q; i++){
			int t = sc.nextInt();
			for(int j = i; j < n; j++){
				if(t == s[j]){
					counter++;
					break;
				}
			}
		}
		System.out.println(counter);
	}
}