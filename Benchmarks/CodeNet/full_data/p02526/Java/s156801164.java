import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt[] = new int[10^7];
		int count = 0;
		int n = sc.nextInt();
		int S[] = new int [n];
		for(int i = 0; i < n; i++){
			S[i] = sc.nextInt();
		}
		
		int q = sc.nextInt();
		int T[] = new int [q];
		for(int i = 0; i < q; i++){
			T[i] = sc.nextInt();
		}
		

		for(int i = 0; i < n; i++){
			if(cnt[S[i]] != 1) cnt[S[i]]++;
		}
		
		for(int i = 0; i < q; i++){
			if(cnt[T[i]] != 2 && cnt[T[i]] == 1){
				cnt[T[i]]++;
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}