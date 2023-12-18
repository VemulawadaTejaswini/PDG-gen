	import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
 
public class Main {
 
	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Map <Integer,Integer> mapP = new HashMap<Integer,Integer> ();
		Map <Integer,Integer> mapS = new TreeMap<Integer,Integer> ();
			// 整数の入力
			int n,p,q,a,b;
			int index,counter,result;
			n = sc.nextInt();
			for(index=0;index<n;index++) {
				p = sc.nextInt();
				mapP.put(index,p);
				mapS.put(p,index);
			}
			sc.close();
			
			result=0;
			counter=0;
			for(Integer s: mapS.keySet()) {
				index=mapS.get(s);
				p=mapP.get(index);
				if(counter!=index) {
					result++;
				}
				counter++;
			}
			if(result==0 || result==2) {
				System.out.print("YES");
			}
			else {
				System.out.print("NO");
			}
			
 
			// 出力
 
	}
}