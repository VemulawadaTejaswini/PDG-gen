import java.util.Scanner;

public class Mani {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int mondaisuu = sc.nextInt();
		int[]mondai = new int [mondaisuu];
		for (int i = 0; i < mondaisuu;i ++){
			mondai[i] = sc.nextInt();
		}
		int nomimonosuu = sc.nextInt();
for(int i = 0; i < nomimonosuu; i++){
		int int1 = 0;
		for(int j = 0; j<nomimonosuu; j++){
			int1 += sc.nextInt();
		}
		int a = mondaisuu - nomimonosuu;
		for(int k = 0; k < a;k++){
			int1 += mondai[k + nomimonosuu];
		}
		System.out.println(int1);
		}
	}
}
