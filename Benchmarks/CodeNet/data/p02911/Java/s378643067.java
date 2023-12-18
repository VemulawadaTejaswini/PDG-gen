import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int sanka = scan.nextInt();
		int point = scan.nextInt();
		int seikai = scan.nextInt();

		int[] array = new int[seikai];

		for(int i=0;i<seikai;i++) {
			array[i] = scan.nextInt();
		}

		int[] yusho = new int[sanka];
		Arrays.fill(yusho, point-seikai);

		for(int i=0;i<seikai;i++) {
			yusho[array[i]-1]++;
		}

		for(int i=0;i<sanka;i++) {
			System.out.println(yusho[i] > 0?"Yes":"No");
		}

/*		long sanka = scan.nextLong();
		long point = scan.nextLong();
		int ans = scan.nextInt();
		long[] answer = new long[ans];

		Map<Integer,Long> kanriMap = new TreeMap<Integer,Long>();

		//keyに初期ポイント，valueに番号をふる
		for(int i=0;i<sanka;i++) {
			kanriMap.put(i+1,point);
		}

		//解答した人
		for(int i=0;i<ans;i++) {

			answer[i] = scan.nextInt();
		}

		//valueが解答した人じゃない人のポイントを1減らす
		for(int i=0;i<answer.length;i++) {
			for(int key:kanriMap.keySet()) {
				if(key == answer[i]) {
					continue;
				}
				kanriMap.put(key, kanriMap.get(key)-1);
			}
		}

		//pointが0以下の人はNo,そのほかはYes
		for(int x:kanriMap.keySet()) {
			System.out.println(kanriMap.get(x) > 0?"Yes":"No");
	}*/
		scan.close();
	}
}
