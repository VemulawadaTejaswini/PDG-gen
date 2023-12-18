import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			long A = scan.nextLong();
			long B = scan.nextLong();
			long X = scan.nextLong();
			//long[]nedan = new long[1000000002];
			/*for(int i = 1;i<=1000000000;i++) {
				long k = A*i+B*ketasuu(i);
				nedan[i] = k;
			}
			
			int a = upperbound(nedan,X);
			*/
			
			long left = 1;
			long right = 1000000001;
			long mid = 0;
			long nedan = 0;
			while(left<right) {
				mid = (left+right)/2;
				//System.out.println(mid);
				nedan = A*mid+B*ketasuu(mid);
				if(nedan<=X) {
					left = mid+1;
				}else {
					right = mid;
					
				}
			}
			
			
			
			
			
			System.out.println(left-1);
			
			
			
		}
		
		
	}
	
	private static int ketasuu(long N) {
		String s = String.valueOf(N);
		return s.length();
		
	}
	
	//2部探索で便利なメソッド
	
	/*値valueがソートされた数列arrの何番目以上かを表示するメソッド
	 * 両方のメソッドとも同じ値を見つけられなかったらそれよりも大きい値の中の最小の番号をいう
	 * 両方ともvalueが前配列より小さかったら０、大きかったらarr[]の最大の番号＋１を表示する。
	 * lowerboundは数列の中から値を発見するのにも便利
	 * arrはソートされた配列
	 * 計算量はlog(o(n))
	 * */
	public static int lowerbound(long[] arr, long value){//value以上のarrたち
        int left = 0;
        int right = arr.length;
        while (left<right){
            int mid = (left+right)/2;
            if (arr[mid]<value){
                left = mid+1;
            }else {//こっちが同じ値を含む条件、見つけたらright側が保持してleftがR=Lになるまでどんどん近づくイメージ
                right = mid;
            }
        }
        return left;
    }
	

    public static int upperbound(long[] arr, long value){//valueより大きいarrたち
        int left = 0;
        int right = arr.length;
        while (left<right){
            int mid = (left+right)/2;
            if (arr[mid]<=value){//見つけたら一個先の番号をleftが保持しrightがR=Lになるまでどんどん近づいてくるイメージ
                left = mid+1;
            }else {
                right = mid;
            }
        }
        return left;
    }
    
    
    
    
    
}
		