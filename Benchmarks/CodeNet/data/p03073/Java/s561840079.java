import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			String s;
			String s1;
			int n;
			int index;
			int index2;
			int result=0;
			Map <Integer,Integer> map = new HashMap<Integer,Integer> ();

			s = sc.next();
			n=s.length();
			sc.close();

			for(index=0;index<n;index++) {
				s1 = s.substring(index,index+1);
				if(index%2==0 && s1.contentEquals("1")) {
						result++;
					}
				else if(index%2==1 && s1.contentEquals("0")) {	
					result++;
					}
				}
			if(result>n-result) {
				result=n-result;
				}
			
			// 出力

			System.out.println(result);
	}
}