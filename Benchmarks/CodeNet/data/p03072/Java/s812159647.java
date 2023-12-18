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
			int h;
			int index;
			int index2;
			int result=1;
			Map <Integer,Integer> map = new HashMap<Integer,Integer> ();

			n = sc.nextInt();
			for(index=0;index<n;index++) {
				h = sc.nextInt();
				map.put(index,h);
				}
			sc.close();

			loop1: for(index=1;index<n;index++) {
				loop2: for(index2=0;index2<index;index2++) {
					if(map.get(index2)>map.get(index)) {
						result--;
						break loop2;
						}
					}
				result++;
				}			
			// 出力

			System.out.println(result);
	}
}