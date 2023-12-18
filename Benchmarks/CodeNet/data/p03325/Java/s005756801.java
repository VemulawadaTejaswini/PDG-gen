import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		long[] a = new long[n];
		for(int i = 0;i < n;i++){
			a[i] = sc.nextLong();
		}
		long ans = 0;
		for(int  i = 0;i < n;i++){
			while(a[i] != 0){
				if(a[i] % 2 == 0){
					a[i] = a[i]/2;
					ans++;
				}else{
					break;
				}
			}
		}
		System.out.println(ans);



	}
	static long sum(long n){
		long l =  String.valueOf(n).length();
		long s = 0l;
		for(int i = 0;i < l;i++){
			s +=  (long)(n/Math.pow(10, l-1-i));
			n -= (long)Math.pow(10, l-1-i) *(long)(n/Math.pow(10, l-1-i));
		}

		return s;


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

