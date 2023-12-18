import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		long[] A = new long[n];

		for(int i = 0;i < n;i++){
			A[i] = sc.nextLong();
		}
		int s = 0;						//左端
		int t = 0;						//右端
		long sum = 0;					//左端から右端までの要素の和
		long ans = 0;

		while(s < n){
			while(t < A.length && sum + A[t] == (sum^A[t])){			//右端の更新
				sum += A[t];
				t++;
			}
			ans += t-s;
			sum -= A[s];
			s++;
			if(s > t){
				t = s;
			}
			
			
		}

		System.out.println(ans);


	}

	static int syautori(int[] data,int S){
		int s = 0;						//左端
		int t = 0;						//右端
		int res = data.length;			//答えの長さ
		int sum = 0;					//左端から右端までの要素の和

		for(;;){
			while(t < data.length && sum < S){			//右端の更新
				sum += data[t];
				t++;
			}
			if(sum < S){				//全部足してもSより小さい時、out
				break;
			}
			res = Math.min(res, t - s);
			sum -= data[s];				//左端の更新
			s++;
		}

		if(res >= data.length){			//全部足してもSより小さい時、0を返す
			res = 0;
		}
		return res;

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

		return end - otherpair.end;
	}
}

