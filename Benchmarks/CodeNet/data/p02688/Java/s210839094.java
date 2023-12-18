
import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		Integer[] Ni = new Integer[N];

		for(int i =0; i<N; i++){
			Ni[i] = 0;
		}

		for(int i =0; i<K; i++){
			int tmpD = sc.nextInt();
			for(int j =0; j<tmpD; j++){
				int target = sc.nextInt();
				Ni[target-1] = 1;
			}
		}

		Integer cnt = 0;
		for(int i =0; i<N; i++){
			if(Ni[i]==0){
				cnt++;
			}
		}

		System.out.println(cnt);
		return;
	}
}
