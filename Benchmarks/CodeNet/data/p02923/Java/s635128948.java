import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int masuNum = scan.nextInt();
		int[] h = new int[masuNum];

		for(int i=0;i<masuNum;i++) {
			h[i] = scan.nextInt();
		}

		int kIdou = 0;
		int kIti = 0;

		for(int i=0;i<masuNum;i++) {
			int idouNum = 0;
			for(int ii=0;ii<masuNum-1-i;ii++) {
				if(h[i+ii] >= h[i+ii+1]) {
					idouNum += 1;
					if(idouNum > kIdou) {
						kIdou = idouNum;
					}
				}else {
					break;
				}
			}
		}
		System.out.println(kIdou);
	}

}
