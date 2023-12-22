import java.util.Scanner;

public class AtBossExpense {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//素数のメモ作成
		int size = 1000001;
		boolean[] prime = new boolean[size];
		for(int i=2; i<size; i++){
			prime[i] = true;
		}
		for(int i=2; i*i<size; i++){
			if(prime[i]){
				for(int j=i*i; j<size; j+=i){
					prime[j] = false;
				}
			}
		}
		
		while(true){
			int set = sc.nextInt();//料理の種類
			limit = sc.nextInt();//予算上限
			if((set | limit)==0) break;
			
			int[] food = new int[set];//料理の値段
			for(int i=0; i<set; i++){
				food[i] = sc.nextInt();
			}
			//公約数チェック
			int yaku = food[0];
			for(int i=1; i<set; i++){
				yaku = ch(food[i], yaku);
				if(yaku==1){
					break;
				}
			}//2以上の公約数を持つ場合、素数を作れない
			if(yaku>1){
				System.out.println("NA");
				continue;
			}
			
			//組み合わせで選ぶことのできる価格をtrue
			memo = new boolean[limit+1];
			memo[0] = true;
			for(int i=0; i<set; i++){
				fx(food[i]);
			}
			//素数の最大金額を選択
			int ans =0;
			for(int i=limit; 0<i; i--){
				if(prime[i] && memo[i]){
					ans = i;
					break;
				}
			}
			System.out.println((ans>0)?ans:"NA");
		}
	}
	static int limit;
	static boolean[] memo;
	//公約数を求める式
	static int ch(int x, int y){
		
		x %= y;
		if(x>0) return ch(y,x);
		else return y;
	}
	//料理の組み合わせで選べる金額をtrue
	static void fx(int x){
		
		for(int j=0; j+x<=limit; j++){
			if(memo[j]==true){
				memo[j+x] = true;
			}
		}
	}
}