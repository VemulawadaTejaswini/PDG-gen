import java.util.*;

public class Main{
	
	int [] data, work;
	boolean [] used;
	String ans, op = "+-*";
	int n = 4;
	boolean flg;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			
			data = new int[n];
			int temp = 0;
			for(int i = 0; i < n; i++){
				data[i] = sc.nextInt();
				temp = temp | data[i];
			}
			if(temp == 0)break;
			
			used = new boolean[n];
			ans = null;
			work = new int[n];
			flg = false;
			dfs(0);
			if(! flg) System.out.println(0);
		}
	}

	private void dfs(int deep) {
		if(flg) return;
		if(deep == n){
			check();
			return;
		}
		for(int i = 0; i < 4; i++){
			if(! used[i]){
				used[i] = true;
				work[deep] = data[i];
				dfs(deep + 1);
				used[i] = false;
				work[deep] = -1;
			}
		}
	}

	private void check() {
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				for(int k = 0; k < 3; k++){
					if(flg) return;
					if(calc(calc(calc(work[0], work[1], i), work[2], j), work[3], k) == 10){
						flg = true;
						System.out.printf("((%d %c %d) %c %d) %c %d\n", work[0], op.charAt(i), work[1], op.charAt(j),
								work[2], op.charAt(k), work[3]);
					}
					
					else if(calc(calc(work[0], work[1], i), calc(work[2], work[3], k), j) == 10){
						flg = true;
						System.out.printf("(%d %c %d) %c (%d %c %d)\n", work[0], op.charAt(i), work[1], op.charAt(j),
								work[2], op.charAt(k), work[3]);
					}
					
					else if(calc(calc(work[0], calc(work[1], work[2], j), i), work[3], k) == 10){
						flg = true;
						System.out.printf("(%d %c (%d %c %d)) %c %d\n", work[0], op.charAt(i), work[1], op.charAt(j),
								work[2], op.charAt(k), work[3]);
					}
					
					else if(calc(work[0], calc(calc(work[1], work[2], j), work[3], k), i) == 10){
						flg = true;
						System.out.printf("%d %c ((%d %c %d) %c %d)\n", work[0], op.charAt(i), work[1], op.charAt(j),
								work[2], op.charAt(k), work[3]);
					}
					
					else if(calc(work[0], calc(work[1], calc(work[2], work[3], k), j), i) == 10){
						flg = true;
						System.out.printf("%d %c (%d %c (%d %c %d))\n", work[0], op.charAt(i), work[1], op.charAt(j),
								work[2], op.charAt(k), work[3]);
					}
				}
			}
		}
	}

	private int calc(int a, int b, int c) {
		switch (c) {
		case 0:
			return a + b;
		case 1:
			return a-b;
		case 2:
			return a*b;
		}
		return 0;
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}