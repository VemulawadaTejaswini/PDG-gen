import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int[]L = new int[N];
			for(int i = 0;i<N;i++)L[i] = scan.nextInt();
			Arrays.sort(L);
			long goukei = 0;
			
			
			for(int i = 0;i<N-1;i++) {
				for(int j = i+1;j<N;j++) {
					int hidari = Math.abs(L[i]-L[j]);
					int H = upperbound(L,hidari);
					//System.out.print(i+" "+j+" ");
					//System.out.print(upperbound(L,hidari));
					//System.out.print(" ");
					
					int migi = L[i]+L[j];
					int M = lowerbound(L,migi)-1;
					//System.out.println(lowerbound(L,migi)-1);
					
					
					int akouho = 0;//lowerbound(L,migi)-upperbound(L,hidari)+1;
					
					//if(H<=i&&i<=M) akouho--;
					if(H<=j&&j<=M) akouho=M-j;
					
							goukei+=akouho;
					
				}
			}
			
			
			System.out.println(goukei);
			
		}
		
		
	}
	
	
	//2部探索で便利なメソッド
	
	/*値valueがソートされた数列arrの何番目以上かを表示するメソッド
	 * 両方のメソッドとも同じ値を見つけられなかったらそれよりも大きい値の中の最小の番号をいう
	 * 両方ともvalueが前配列より小さかったら０、大きかったらarr[]の最大の番号＋１を表示する。
	 * lowerboundは数列の中から値を発見するのにも便利
	 * arrはソートされた配列
	 * 計算量はlog(o(n))
	 * */
	public static int lowerbound(int [] arr, int value){//value以上のarrたち
        int left = 0;//左端は探索したい物の一番左端の番号を選択
        int right = arr.length;//右端は探索したい物の一番右端の番号+1を選択(重要)
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
	
	//lowerboundと仕様が違うので要注意
	//配列が大きすぎて作れない場合がほとんどなので無理にメソッドとして使わなくてもいい、考えは同じ

    public static int upperbound(int[] arr, int value){//valueより大きいarrたちの中の一番目を出力
        int left = 0;//左端は探索したい物の一番左端の番号を選択
        int right = arr.length;//右端は探索したい物の一番右端の番号+1を選択(重要)
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
