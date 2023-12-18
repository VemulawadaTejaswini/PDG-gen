import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void main(String[] args){
		Map <Integer,Integer> mapL = new HashMap<Integer,Integer> ();

		Scanner sc = new Scanner(System.in);
			// 整数の入力
			int n,x,index,a,b,p;
			int result,len,sumLen;
			n = sc.nextInt();
			x = sc.nextInt();
			sumLen=0;
			result=n+1;
			for (index=0;index<n;index++) {
				len = sc.nextInt();
				sumLen=sumLen+len;
				if(sumLen>x) {
					result=index+1;
					break;
				}
			}
			sc.close();
			System.out.println(result);

			// 出力

	}
}