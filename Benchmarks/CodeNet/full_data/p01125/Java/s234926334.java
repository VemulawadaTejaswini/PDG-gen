import java.util.*;

public class Main{

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			boolean [][] s = new boolean[21][21];
			for(int i = 0; i < n; i++){
				int xx = sc.nextInt();
				int yy = sc.nextInt();
				s[yy][xx] = true;
			}
			int m = sc.nextInt();
			int x = 10,  y = 10;
			int count = 0;
			for(int i = 0; i < m; i++){
				char c = sc.next().charAt(0);
				int len = sc.nextInt();
				for(int j = 0; j < len; j++){
					if(c == 'N'){
						y++;
					}
					else if(c == 'S'){
						y--;
					}
					else if(c == 'E'){
						x++;
					}
					else{
						x--;
					}
					if(s[y][x]){
						s[y][x] = false;
						count++;
					}
				}
			}
			if(count == n){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}

		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}