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
			int n;
			Map <Integer,Integer> mapV = new HashMap<Integer,Integer> ();
			Map <Integer,Integer> mapC = new HashMap<Integer,Integer> ();
			Map <Integer,Integer> mapR = new HashMap<Integer,Integer> ();
			int v,c,index;
			int result;
			n = sc.nextInt();
			for(index=0;index<n;index++) {
				v = sc.nextInt();
				mapV.put(index,v);
			}
			result=0;
			for(index=0;index<n;index++) {
				c = sc.nextInt();
				mapC.put(index,c);
				v=mapV.get(index);
				if(v-c>0) {
					result=result+v-c;
				}
			}
			// 出力
			System.out.println(result);
	}
}