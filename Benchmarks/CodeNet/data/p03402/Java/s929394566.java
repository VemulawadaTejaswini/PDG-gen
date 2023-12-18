import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int cnt = 50;
		char[][] g = new char[cnt][cnt];
		for(int i = 0; i < cnt/2; i++) {
			for(int j = 0; j < cnt; j++) {
				g[i][j] = '#';
			}
		}
		for(int i = cnt/2; i < cnt; i++) {
			for(int j = 0; j < cnt; j++) {
				g[i][j] = '.';
			}
		}

		int anum = 1;
		int bnum = 1;

		for(int i = 0; i < cnt/2; i++) {
			for(int j = (i % 2) == 0 ? 0 : 1; j < cnt; j+=2) {
				g[i][j] = '.';
				anum++;
				if(anum == a)
					break;
			}
			if(anum == a)
				break;
		}
		for(int i = cnt/2+1; i < cnt; i++) {
			for(int j = (i % 2) == 0 ? 0 : 1; j < cnt; j+=2) {
				g[i][j] = '#';
				bnum++;
				if(bnum == b)
					break;
			}
			if(bnum == b)
				break;
		}

		for(int i = 0; i < cnt; i++) {
			for(int j = 0; j < cnt; j++) {
				System.out.print(g[i][j]);
			}
			System.out.println("");
		}
	}
}
