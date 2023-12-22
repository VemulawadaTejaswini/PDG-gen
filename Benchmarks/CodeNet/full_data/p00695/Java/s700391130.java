import java.util.Scanner;

public class Main {
	int  [][] data;

	private int check(int x, int y) {
		int ans = 0,xlen = 5;
		for(int i = y; i < 5;i++){
			for(int j = x; j < xlen; j++){
				if(data[i][j] == 0){
					xlen = j;
					break;
				}
				ans = Math.max(ans, (i - y + 1) * (j- x + 1));
			}
		}
		return ans;
	}

	private void doIt() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- > 0){
			data = new int[5][5];
			for(int i=0; i < 5;i++){
				for(int j=0; j < 5; j++){
					data[i][j] = sc.nextInt();
				}
			}

			int max = 0;
			for(int i=0; i < 5; i++){
				for(int j=0; j < 5; j++){
					if(data[i][j] == 1){
						int temp = check(j,i);
						max = Math.max(max, temp);
					}

				}
			}
			System.out.println(max);
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}

}