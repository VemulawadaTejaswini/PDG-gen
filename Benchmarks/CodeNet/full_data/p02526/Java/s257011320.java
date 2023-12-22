import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int counter = 0;
		int n = sc.nextInt();
		long[] s = new long [n];
		for(int i = 0; i < s.length; i++){
			s[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		long[] t = new long [q];
		for(int i = 0; i < t.length; i++){
			t[i] = sc.nextInt();
		}
		Arrays.sort(s);
		Arrays.sort(t);
		for(int i = 0; i < t.length; i++){
			for(int j = i; j < s.length; j++){
				if(t[i] == s[j]){
					counter++;
					break;
				}
			}
		}
		System.out.println(counter);
	}
}