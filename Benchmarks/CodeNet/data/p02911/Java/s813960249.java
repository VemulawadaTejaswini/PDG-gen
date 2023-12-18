import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long sanka = scan.nextLong();
		long point = scan.nextLong();
		int ans = scan.nextInt();
		long[] answer = new long[ans];

		Map<Integer,Long> kanri = new TreeMap<Integer,Long>();

		//keyに初期ポイント，valueに番号をふる
		for(int i=0;i<sanka;i++) {
			kanri.put(i+1,point);
		}

		//解答した人
		for(int i=0;i<ans;i++) {

			answer[i] = scan.nextInt();
		}

		//valueが解答した人じゃない人のポイントを1減らす
		for(int i=0;i<answer.length;i++) {
			for(int key:kanri.keySet()) {
				if(key == answer[i]) {
					continue;
				}
				kanri.put(key, kanri.get(key)-1);
			}
		}

		//pointが0以下の人はNo,そのほかはYes
		for(int x:kanri.keySet()) {
			System.out.println(kanri.get(x) > 0?"Yes":"No");
		}
		scan.close();
	}
}
