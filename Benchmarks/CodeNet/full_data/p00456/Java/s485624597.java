import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	/**
	 * @param args
	 */
	static int[] score_W = new int[10];
	static int[] score_K = new int[10];
	public static void main(String[] args) {
		// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδソツッツドツ・ツスツタツブ
		read();
		slove();
	}
	static boolean read(){
		for(int i = 0; i < 10; i++){
			score_W[i] = sc.nextInt();
		}
		for(int j = 0; j < 10; j++){
			score_K[j] = sc.nextInt();
		}
		return true;
	}
	static void slove(){
		java.util.Arrays.sort(score_W);
		java.util.Arrays.sort(score_K);
		int w = score_W[7]+score_W[8]+score_W[9];
		int k = score_K[7]+score_K[8]+score_K[9];
		System.out.print(w);
		System.out.println(" " + k);
		
	}
	
}