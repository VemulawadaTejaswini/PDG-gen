    import java.util.*;
    public class Main {
    	public static void main(String[] args){
    		Scanner sc = new Scanner(System.in);
    		// "s"型ピースの個数の入力
    		long N = sc.nextInt();
		// "c"型ピースの個数の入力
		long M = sc.nextInt();
		long ans;
		//場合分け("c"型ピースがあまる)
		if(N*2<M){
			ans = N+(int)((M-N*2)/4);
		}else{
		//場合分け("s"型ピースがあまる)
			ans = (int)((M)/4);
}
    		// あまりを出力
    		System.out.println(ans);
    	}
    }