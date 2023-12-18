import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int[] h =new int[n];
		for(int i = 0;i < n;i++){
			h[i] = sc.nextInt();
		}
		int ans = 0;

		while(true){
			boolean cc = true;
			for(int i = 0;i < n;i++){			//チェック
				if(h[i] != 0){
					cc = false;
				}
			}
			if(cc){
				break;
			}

			int l = 0;			//左端
			while(h[l] == 0){
				l++;
			}
			int r = l+1;			//右端
			if(r < n){
				while( h[r] != 0 ){
					r++;
					if(r >= n){
						break;
					}
				}
			}

			for(int x = l;x < r;x++){			//-1
				h[x]--;
			}
			ans++;



		}
		System.out.println(ans);

	}


}

class Pair implements Comparable{
	int from;		//p
	int end;		//y
	int num;
	int bango;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return from - otherpair.from;
	}
}

