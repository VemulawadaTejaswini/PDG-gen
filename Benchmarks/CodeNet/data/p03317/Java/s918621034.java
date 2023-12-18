import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力


		int n = sc.nextInt();
		int k = sc.nextInt()-1;
		int[] a = new int[n+1];
		for(int i = 1;i <= n;i++){
			a[i] = sc.nextInt();
		}
		int one = 0;

		for(int i = 1;i <= n;i++){
			if(a[i] == 1){
				one = i;
			}
		}

		int left = one - 1;
		int right = n - one;
		int ans = 0;

		int l = 0;
		int r = 0;

		if(left < right){
			if(left == 0){

			}else if(left < k){
				ans++;
				right -= k - left;
				left = 0;
			}else{
				if(left % k == 0) {
					l = left/k;
				}else{
					ans++;
					int lamari = l % k;
					right -=k - lamari;
					l = left/k;
				}
			}

			if(right <= 0){

			}else{
				if(right % k == 0) {
					r = right/k;
				}else{
					r = right/k + 1;
				}
			}

		}else{
			if(right == 0){

			}else if(right < k){
				ans++;
				left -= k - right;
				right = 0;
			}else{
				if(right % k == 0) {
					r = right/k;
				}else{
					int ramari = right % k;
					l -= k - ramari;
					r = right/k;
				}				
			}
			
			if(left <= 0){
				
			}else{
				if(left % k == 0) {
					l = left/k;
				}else{
					l = left/k + 1;
				}
			}

		}

		ans += l + r;
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

