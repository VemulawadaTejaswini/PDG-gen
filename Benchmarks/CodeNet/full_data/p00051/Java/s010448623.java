import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int[] s = new int[9];
	static int count;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδソツッツドツ・ツスツタツブ
		while(read()){
		}
	}
	static boolean read(){
		count = sc.nextInt();
		for(int i = 0; i < count; i++){
			slove();
		}
		return true;
	}
	static void slove(){
		String line;
		char c;
		line = sc.next();
		for(int i = 1; i < 9; i++){
			c = line.charAt(i-1);
			s[i] = Integer.parseInt(String.valueOf(c));
			//System.out.print(s[i]);
		}
		java.util.Arrays.sort(s);
		int min = 0, max = 0;
		int j = 1;
		for(int k = 1; k < 9; k++){
			min += s[k]*10000000/j;
			max += s[k]*j;
			j *=10;
		}
		System.out.println(max - min);
	}

}