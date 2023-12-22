import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		int[] S = new int[100000];
		int[] T = new int[50000];
		int n = scan.nextInt();
		for(int i = 0; i < n;i++){
			S[i] = scan.nextInt();
		}
		int q = scan.nextInt();
		for(int i = 0; i < q;i++){
			T[i] = scan.nextInt();
		}
		for(int i = 0; i < 50000; i++){
			for(int j = 0; j < 100000; j++){
				if(T[i] == S[j]){
					cnt++;
					break;
				}
			}
		}
		System.out.println(cnt);
	}
}