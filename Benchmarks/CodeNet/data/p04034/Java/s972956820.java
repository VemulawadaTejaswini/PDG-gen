import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] aka = new int[100005];
		int[] ryou = new int[100005];
		
		for(int i = 0; i < 100005; i++){
			ryou[i] = 1;
			aka[i] = 0;
		}
		aka[0] = 1;
		
		
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		
		
		for(int i = 0; i < M; i++){
			int a = scan.nextInt();
			int b = scan.nextInt();
			a--;
			b--;
			
			ryou[a]--;
			ryou[b]++;
			if(aka[a] == 1){
				aka[b] = 1;
				if(ryou[a] == 0){
					aka[a] = 0;
				}
			}
			
		}
		
		int ans = 0;
		for(int i = 0; i < N; i++){
			if(aka[i] == 1){
				ans++;
			}
		}
		
		System.out.println(ans);
		
	}
}