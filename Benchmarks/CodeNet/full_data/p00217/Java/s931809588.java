import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n, p, d1, d2;
	static int[][]info;
	static int[] distance, number;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδソツッツドツ・ツスツタツブ
		while(read()){
			slove();
		}
	}
	static boolean read(){
		n = sc.nextInt();
		if(n == 0)
			return false;
		
		info = new int[n][3];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < 3; j++){
				info[i][j] = sc.nextInt();
			}
		}
		return true;
	}
	static void slove(){
		distance = new int[n];
		number = new int[n];
		for(int i = 0; i < n; i++){
			distance[i] = info[i][1] + info[i][2];
			number[i] = info[i][0];
		}
		//java.util.Arrays.sort(distance);
		int max = 0;
		int index = 0;
		for(int j = 0; j < n; j++){
			if(max < distance[j]){
				max = distance[j];
				index = number[j];
			}
		}
		System.out.print(index + " ");
		System.out.println(max);
	}
}