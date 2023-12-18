import java.util.Scanner;

/**
 * https://abc051.contest.atcoder.jp/tasks/abc051_c
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int tx = sc.nextInt();
		int ty = sc.nextInt();
		sc.close();
		
		int dx = tx-sx;
		int dy = ty-sy;
		
		StringBuilder ans = new StringBuilder();
		for(int i=0; i<dx; i++) ans.append('R');
		for(int i=0; i<dy; i++) ans.append('U');
		for(int i=0; i<dx; i++) ans.append('L');
		for(int i=0; i<dy; i++) ans.append('D');
		ans.append('D');
		for(int i=0; i<=dx; i++) ans.append('R');
		for(int i=0; i<=dy; i++) ans.append('U');
		ans.append('L');
		ans.append('U');
		for(int i=0; i<=dx; i++) ans.append('L');
		for(int i=0; i<=dy; i++) ans.append('D');
		ans.append('R');
		
		System.out.println(ans.toString());
	}

}
