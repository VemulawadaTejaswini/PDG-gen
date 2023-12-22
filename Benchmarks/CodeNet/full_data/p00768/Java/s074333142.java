import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {

		for (;;) {
			int m = sc.nextInt();
			int t = sc.nextInt();
			int p = sc.nextInt();
			int r = sc.nextInt();

			if (m == 0 && t == 0 && p == 0 && r == 0) {
				break;
			}

			int score[][] = new int[t][p];
			int solved[][] = new int[t][p];
			for (int i = 0; i < r; i++) {
				int mm = sc.nextInt();
				int tt = sc.nextInt()-1;
				int pp = sc.nextInt()-1;
				int jj = sc.nextInt();
				
				if(jj == 0){
					score[tt][pp] += mm;
					solved[tt][pp] = 1;
				}else{
					score[tt][pp] += 20;
				}
			}
			
			E[] ee = new E[t];
			for(int i = 0; i < t; i++){
				E e = new E();
				e.sol = 0;
				e.pen = 0;
				e.id = i+1;
				for(int j = 0 ; j < p ;j++){
					e.sol += solved[i][j];
					e.pen += solved[i][j] * score[i][j];
				}
				ee[i] = e;
			}
			Arrays.sort(ee,Main::compare);
			
			for(int i =0 ; i< t-1;i++){
				System.out.print(ee[i].id);
				System.out.print(ee[i].sol == ee[i+1].sol && ee[i].pen == ee[i+1].pen ?"=":",");
			}
			System.out.println(ee[t-1].id);
		}
	}
	class E{
		int sol;
		int pen;
		int id;
	}
	static int compare(E a, E b){
		return a.sol == b.sol? a.pen == b.pen? b.id-a.id:a.pen-b.pen:b.sol-a.sol;
	}
	
}

