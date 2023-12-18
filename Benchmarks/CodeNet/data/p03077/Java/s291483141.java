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
			Long n;
			Long result;
			Long r;
			int index;
			int index0;
			Long a;
			Long a0;
			result=0L;
			a0=0L;
			index0=0;
			
			n=sc.nextLong();
			
			Map <Integer,Integer> map= new HashMap<Integer,Integer> ();
			for(index=0;index<5;index++) {
				a = sc.nextLong();
				if(index==0) {
					a0=a;
					index0=0;
					}
				else if(a<a0) {
					a0=a;
					index0=index;
					}
				}
			sc.close();
			
			// 
			r = n%a0;
			result = (n-r) / a0;
			if(n<=a0) {
				result=(long)5;
			}
			else if(r>0) {
				result=result+5;
			}
			else {
				result=result+4;
			}
			
			// 出力
			System.out.println(result);
	}
}