
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*普通に書いたらすぐかけたけど、なんでもLONGですらまかないきれない数値が出てきたそうで、時間切れではなくて、
		 * BIGINTEGERとかいうのを初めて使った。それで結果は、時間切れ。。。。で解説をカンニング。
		 * 
		 * 漸化式で解くそうです。なるほどなぁ。その一言でピンときた。処理をそうやって節約していくわけね。これは思いつかんわ。
		 * 
		*まず一桁めで、
		*あまりの個数[keta][amari] = 何個何個
		*次のけたが一つ増えた場合にどうなるのかですが、
		*次の桁数が例えば３の場合は、
		*５と言う数字が３５になるわけで、
		*１３で割った余は５から９になる。つまり４増えた値になるわけね。
		*この４と言う数字はどっから出てくる。３０わる１３　＝　２あまり４
		*なーるほど。て言うかこんなの思いつきますか？　完全に数学のテストで使う脳ですやん。
		*
		*/
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		s.toCharArray();
		int keta = s.length();
		int[][] keta_amari = new int [keta][13];
		if (s.charAt(keta-1) == '?') {
			for (int i = 0 ; i < 9; i ++) {
				keta_amari[0][i] ++;
			}
		}else {
			System.out.println(Character.getNumericValue(s.charAt(keta -1)));
			keta_amari[0][Character.getNumericValue(s.charAt(keta -1))%13] ++;
		}
		
		for (int k = 2 ; k <=keta ; k ++) {
			if(s.charAt(keta -k) != '?') {
				int l  = Character.getNumericValue(s.charAt(keta -k)); 
				int temp = (int) ((l*Math.pow(10, k-1))%13);
				for (int i = 0 ; i < 13 ;i ++) {
					keta_amari[k-1][i] = keta_amari[k-2][((13-temp) +i)%13];
					//System.out.println(((13-temp) +i)%13);
				}
			}else {
				int list[] = {0,1,2,3,4,5,6,7,8,9};
				for (int l: list) {
					int temp = (int) ((l*Math.pow(10, k-1))%13);
					for (int i = 0 ; i < 13 ;i ++) {
						keta_amari[k-1][i] += keta_amari[k-2][((13-temp) +i)%13];
						//System.out.println(((13-temp) +i)%13);
					}	
				}
			}
		}
		
		System.out.println((keta_amari[keta-1][5])%1000000007);	
	}
}
