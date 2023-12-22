import java.util.Scanner;

/**
 * Vampirish Night
 *  URL:http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=1019&lang=jp
 *
 * @author Igari Kazuya
 */
public class P1019_Vampirish_Night {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδソツッツドツ・ツスツタツブ
		Scanner sc = new Scanner(System.in);
		int n,k;
		while(true){
			n = sc.nextInt();
			k = sc.nextInt();

			if(n==0 && k==0){
				break;
			}

			int[][] array = new int[n+1][k];
			for(int i=0;i<n+1;i++){
				for(int j=0;j<k;j++){
					array[i][j] = sc.nextInt();
				}
			}

			for(int i=1;i<n+1;i++){
				for(int j=0;j<k;j++){
					array[0][j] -= array[i][j];
				}
			}

			boolean flag = true;
			for(int i=0;i<k;i++){
				if(array[0][i] < 0){
					flag = false;
				}
			}

			if(flag){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
	}

}