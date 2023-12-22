import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  //領域の数
		int region[] = new int[n];

		int heightMax = 0;
		int islandMax = 0;  //島の数の最大値

		for(int i = 0; i < n; i++) {
			region[i] = sc.nextInt();
			if(heightMax < region[i]) heightMax = region[i];
		}

		for(int i = 0; i < heightMax; i++) {  //海面の高さのループ
		    int count1 = 0;  //島の数
			boolean flag = false;  //海面ならばfalse、陸地ならばtrue

			for(int j = 0; j < n; j++) {  //領域のループ
				if(!flag) {
					if(region[j] - i > 0) {
						flag = true;
					}
				}
				else {
					if(region[j] - i <= 0) {
						flag = false;
						count1++;
					}
				}

				if(j == n - 1) {  //最後の領域判定時にtrueだったらcountを1増やす
					if(flag) count1++;
				}
			}

			if(islandMax < count1) islandMax = count1;
		}

		System.out.println(islandMax);
	}

}
