    import java.util.*;
    public class Main {
    	public static void main(String[] args){
    		Scanner sc = new Scanner(System.in);
    		// トレーニング回数の入力
    		int N = sc.nextInt();
		// すぬけくんの初期パワー
		long IniPwr = 1;
		//10^9+7
		double a = Math.pow(10,5) + 7;
		// N回トレーニングしたあとのパワー
		for (int i=1 ; 0<i && i<=N ; i++){
			IniPwr = (long)(IniPwr * (long)i)%(long)a;
		}
		long b = IniPwr%(long)a;
    		// あまりを出力
    		System.out.println(b);
    	}
    }