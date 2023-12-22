import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	static	int[][] gems;
	static	boolean[][] roboflag = new boolean[21][21];
	static	int gemNum;
	static	int actNum;
	static	int itmp;
	static	String stmp;
	static	int x,y;
	public static void main (String[] args) {
		while(true) {
			gemNum= scan.nextInt();
			if(gemNum == 0) break;
			gems = new int[gemNum][2];
			for(int i = 0; i < gemNum; i++) {
				gems[i][0] = scan.nextInt();
				gems[i][1] = scan.nextInt();
			}
			actNum = scan.nextInt();
			roboflag = new boolean[21][21];
			x = 10;
			y = 10;
			for(int j = 0; j < actNum; j++) {
				stmp = scan.next();
				itmp = scan.nextInt();
				if(stmp.equals("N")) {
					for(int i = 0; i <= itmp; i++) {
						roboflag[x][y+i] = true;
					}
					y += itmp;
				} else if(stmp.equals("E")) {
					for(int i = 0; i <= itmp; i++) {
						roboflag[x+i][y] = true;
					}
					x += itmp;
				} else if(stmp.equals("S")) {
					for(int i = 0; i <= itmp; i++) {
						roboflag[x][y-i] = true;
					}
					y -= itmp;
				} else if(stmp.equals("W")) {
					for(int i = 0; i <= itmp; i++) {
						roboflag[x-i][y] = true;
					}
					x -= itmp;
				}
			}
			//map();
			for(int i = 0; i <= gemNum; i++) {
				if(i == gemNum) {
					System.out.println("Yes");
					break;
				}
				if(!roboflag[gems[i][0]][gems[i][1]]) {
					System.out.println("No");
					break;
				}
			}
		}
	}
	public static void map() {
		boolean flag;
		for(int i = 0; i <= 20; i++) System.out.print(i + " ");
		System.out.println();
		for(int i = 0; i <= 20;i++) {
			System.out.print(i + " ");
			for(int j = 0; j<= 20; j++) {
			flag = false;
				for(int m = 0; m < gemNum; m++) {
					if(gems[m][0] == i && gems[m][1] == j) {
						System.out.print("- ");
						flag = true;
					}
				}
				if(!flag)	System.out.print("+ ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 0; i <= 20; i++) System.out.print(i + " ");
		System.out.println();
		for(int i = 0; i <= 20;i++) {
			System.out.print(i + " ");
			for(int j = 0; j<= 20; j++) {
				if(roboflag[i][j]) System.out.print("~ ");
				else System.out.print("+ ");
				
			}
			System.out.println();
		}
	}
}