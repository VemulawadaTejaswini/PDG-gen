import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long H[] = new long[N];
		for(int i = 0 ; i < N ; ++i){
			H[i] = sc.nextLong();			
		}
		int max = 0;
		int cur = 0;
		int move = 0;
		while(cur < N - 1){
			if(H[cur] >= H[cur + 1]){
				++move;				
			}else{
				max = Math.max(move, max);
				move = 0;
			}
			++cur;
		}
		max = Math.max(move, max);
		System.out.println(max);
	}
}
