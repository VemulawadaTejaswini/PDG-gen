import java.util.Scanner;

public class Main {
	static int popCount(String x){
		int cnt = 0;
		for(char c : x.toCharArray()){
			if(c == '1'){
				++cnt;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String X = sc.next();
		int popCount = popCount(X);
		int memo[] = new int[popCount + 2];
		memo[0] = 0;
		for(int i = 1 ; i < memo.length ; ++i){
			int cnt = 0;
			int x = i;
			while(x != 0){
				int p = Integer.bitCount(x);
				x = x % p;
				++cnt;
			}
			memo[i] = cnt;
		}
		int mods[][] = new int[N][3];
		mods[0][0] = 1;
		mods[0][1] = 1;
		mods[0][2] = 1;
		for(int i = 1 ; i < N ; ++i){
			if(popCount > 0){
				mods[i][0] = (mods[i - 1][0] * 2) % popCount;				
			}
			mods[i][1] = (mods[i - 1][1] * 2) % (popCount + 1);
			if(popCount > 1){
				mods[i][2] = (mods[i - 1][2] * 2) % (popCount - 1);				
			}
		}
		int M[] = new int[3];
		for(int i = 0 ; i < N ; ++i){
			if(X.charAt(i) == '1'){
				M[1] = (mods[N - 1 - i][1] + M[1]) % (popCount + 1);
				if(popCount > 0){
					M[0] = (mods[N - 1 - i][0] + M[0]) % popCount;					
				}
				if(popCount > 1){
					M[2] = (mods[N - 1 - i][2] + M[2]) % (popCount - 1);					
				}

			}
		}
		for(int i = 0 ; i < N ; ++i){
			int c = X.charAt(i) == '1' ? 1 : 0;
			if(c == 0){
				int mod = M[1];
				mod = (mod + mods[N - 1 - i][1]) % (popCount + 1);				
				System.out.println(memo[mod] + 1);
			}else{
				if(popCount == 1){
					System.out.println(0);
				}else{
					int mod = M[2];
					mod = (mod - mods[N - 1 - i][2] + popCount - 1) % (popCount - 1);								
					System.out.println(memo[mod] + 1);					
				}
			}
		}
	}
}
