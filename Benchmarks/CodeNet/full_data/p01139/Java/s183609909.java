import java.util.Scanner;

public class Main {

	char [][] data;
	int black,white,temp;
	char state;

	final int []xdir = {0,1,0,-1};
	final int []ydir = {1,0,-1,0};

	private void solve(int x, int y){
		if(data[y][x] == '*'){
			return;
		}
		if(data[y][x] == 'W'){
			if(state == 'N')
				state = 'W';
			if(state == 'B')
				state = 'D';
			return;
		}
		if(data[y][x] == 'B'){
			if(state == 'N')
				state = 'B';
			if(state == 'W')
				state = 'D';
			return;
		}
		data[y][x] = '*';
		temp++;
		for(int i=0; i < 4; i++)
			solve(x + xdir[i], y + ydir[i]);
	}

	private void doIt() {
		Scanner sc = new Scanner(System.in);
		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w == 0 && h == 0){
				break;
			}
			data = new char[h + 2][w + 2];
			black = 0;
			white = 0;
			temp = 0;
			state = 'N';
			for(int i=0; i <= h + 1; i++){
				data[i][0] = '*';
				data[i][w+1] = '*';
			}
			for(int i =0; i <= w + 1; i++){
				data[0][i] = '*';
				data[h+1][i] = '*';
			}
			for(int i=1; i < h + 1; i++){
				String str = sc.next();
				for(int j = 1; j < w + 1; j++){
					data[i][j] = str.charAt(j - 1);
				}
			}

			for(int i=1; i < h + 1; i++){
				for(int j=1; j < w + 1; j++){
					if(data[i][j] == '.'){
						solve(j,i);
						//System.out.println(temp + " " + black + " " + white+ " "+  i + " " + j);
						switch(state){
						case 'B':
							black += temp;
							temp = 0;
							state = 'N';
							break;
						case 'W':
							white += temp;
							temp = 0;
							state = 'N';
							break;
						default:
							temp = 0;
							state = 'N';
						}
					}
				}
			}
			System.out.println(black + " " + white);

			//debug
//			for(int i=0; i <= h + 1; i++){
//				for(int j = 0; j <= w + 1; j++){
//					System.out.print(data[i][j] + " ");
//				}
//				System.out.println("");
//			}
		}

	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}

}