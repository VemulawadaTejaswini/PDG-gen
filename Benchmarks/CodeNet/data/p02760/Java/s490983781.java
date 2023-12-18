
import java.util.Scanner;
//
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		int[][] bingo =new int[3][3];
		boolean[][] isHit=new boolean[3][3];
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				bingo[i][j] =sc.nextInt();
				isHit[i][j]=false;
			}
		}
		int n=sc.nextInt();
		for (int k=0;k<n;k++) {
			int drawnCard =sc.nextInt();
			for (int i=0;i<3;i++) {
				for (int j=0;j<3;j++) {
					if (drawnCard==bingo[i][j]) {
						isHit[i][j]=true;
					}
				}
			}
		}
		boolean isBingo =false;
		for (int i=0;i<3;i++) {
			if(isHit[0][i]&&isHit[1][i]&&isHit[2][i]) {
				isBingo =true;
			}
		}
		for (int i=0;i<3;i++) {
			if(isHit[i][0]&&isHit[i][1]&&isHit[i][2]) {
				isBingo =true;
			}
		}
		if (isHit[0][0]&&isHit[1][1]&&isHit[2][2]) {
			isBingo=true;
		}
		if (isHit[0][2]&&isHit[1][1]&&isHit[2][0]) {
			isBingo=true;
		}
		if (isBingo) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
			//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		}
		//----------------------------------------
		//置き場
		
		//----------------------------------------
	}