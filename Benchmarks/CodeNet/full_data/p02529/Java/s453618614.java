import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int S[] = new int[101];
		for (int i = 0; i < n; i++){
			S[i] = scan.nextInt();
		}
		
		int T[] = new int[101];
		int q = scan.nextInt();
		for (int i = 0; i < q; i++){
			T[i] = scan.nextInt();
		}
		int cnt = 0;
		
		for (int i = 0; i < q; i++) {
			for (int j = 0; j < n; j++){
				if (T[i] == S[j]){
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}