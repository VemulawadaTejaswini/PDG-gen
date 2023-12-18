import java.util.Scanner;

class Main{
	static final long MOD = 1000000007;

	static int H, W, K;
	static long[][] dp = new long[110][10];
	static int ans = 0;
	static long n = 0;




	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int[] even = new int[n/2];
		int[] odd = new int[n/2];
		for(int i = 0;i < n/2;i++){
			even[i] = sc.nextInt();
			odd[i] = sc.nextInt();
		}
		int[] edata = new int[100001];
		int[] odata = new int[100001];
		for(int i = 0;i < n/2;i++){				//頻度チェック
			edata[even[i]]++;
			odata[odd[i]]++;
		}
		
		int feven = 0;			//偶数番目の中での最頻数
		int seven = 0;			//偶数番目の中での2番目の頻数
		int max = 0;
		for(int i = 0;i <= 100000;i++){
			if(max < edata[i]){
				seven = feven;
				feven = i;
				max = edata[i];
			}
			if(edata[seven] < edata[i]){
				seven = i;
			}
		}
		int fodd = 0;			//偶数番目の中での最頻数
		int sodd = 0;			//偶数番目の中での2番目の頻数
		max = 0;
		for(int i = 1;i <= 100000;i++){
			if(max < odata[i]){
				sodd = fodd;
				fodd = i;
				max = odata[i];
			}
			if(odata[sodd] < odata[i]){
				sodd = i;
			}
		}
		if(feven != fodd){
			int count = 0;
			for(int i = 0;i < n/2;i++){
				if(even[i] != feven){
					count++;
				}
			}
			for(int i = 0;i < n/2;i++){
				if(odd[i] != fodd){
					count++;
				}
			}
			System.out.println(count);
			return;
		}else{
			int count1 = 0;
			int count2 = 0;
			for(int i = 0;i < n/2;i++){
				if(even[i] != feven){
					count1++;
				}
				if(odd[i] != sodd){
					count1++;
				}
			}
			for(int i = 0;i < n/2;i++){
				if(even[i] != seven){
					count2++;
				}
				if(odd[i] != fodd){
					count2++;
				}
			}
			int ans = Math.min(count1, count2);
			System.out.println(ans);
			
			
		}
		
		
		
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

