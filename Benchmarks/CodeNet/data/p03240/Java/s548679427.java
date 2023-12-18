
import java.util.Scanner;

//C
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());

		int[] xList = new int[N];
		int[] yList = new int[N];
		int[] hList = new int[N];

		for(int i = 0; i < N; i++) {
			xList[i] = Integer.parseInt(sc.next());
			yList[i] = Integer.parseInt(sc.next());
			hList[i] = Integer.parseInt(sc.next());

		}


		for(int Cx = 0; Cx <= 100; Cx++) {
			for(int Cy = 0; Cy<= 100; Cy++) {
				int Hkoho = 0;
				boolean seikaiFlg = true;

				// hi が0じゃない最初のやつを探す (全部0は特定できるという条件から、ありえない)
				for(int i = 1; i < N; i++){
					if(hList[i] == 0) {
						continue;
					}else {
						Hkoho =  (Math.abs(xList[i] - Cx) + Math.abs(yList[i] - Cy)) + hList[i];
						break;
					}
				}

				for(int i = 0; i < N; i++){
					int aaa = Hkoho - (Math.abs(xList[i] - Cx) + Math.abs(yList[i] - Cy));

					if(aaa < 0) {
						if(hList[i] == 0) {
							continue;
						}else {
							// 次の座標へ
							seikaiFlg = false;
							break;
						}
					}else{
						if(hList[i] == aaa) {
							continue;
						}else {
							// 次の座標へ
							seikaiFlg = false;
							break;
						}
					}
				}
				if(seikaiFlg == true) {
					System.out.println(Cx + " " + Cy + " "+ Hkoho);
				}

			}
		}
	}
}
