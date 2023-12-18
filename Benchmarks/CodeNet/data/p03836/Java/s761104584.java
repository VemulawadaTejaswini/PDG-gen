import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sx = scn.nextInt();
		int sy = scn.nextInt();
		int tx = scn.nextInt();
		int ty = scn.nextInt();
		int x = tx - sx;
		int y = ty - sy;
		String str = "";
		for(int i = 0;i < x;i++) {
			str += 'R';
		}
		for(int i = 0;i < y;i++) {
			str += 'U';
		}
		for(int i = 0;i < x;i++) {
			str += 'L';
		}
		for(int i = 0;i < x;i++) {
			str += 'D';
		}
		str += 'D';
		for(int i = 0;i < x+1;i++) {
			str += 'R';
		}for(int i = 0;i < x+1;i++) {
			str += 'U';
		}
		str += 'L';
		str += 'U';
		for(int i = 0;i < x+1;i++) {
			str += 'L';
		}for(int i = 0;i < x+1;i++) {
			str += 'D';
		}
		str += 'R';
		System.out.println(str);
	}

}
