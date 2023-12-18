import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int sum = 0;
		int[] card = new int[N];
		for(int i=0; i<N; i++){
			card[i] = sc.nextInt();
			sum += card[i];
		}
		sc.close();
		
		
		int ans = 0;
		if(sum<K){
			ans = card.length;
		}else{
			Arrays.sort(card);
			for(int n:card){
				sum=sum-n;
				if(sum<K) break;
				ans++;
			}
		}
		
		System.out.println(ans);

	}

}