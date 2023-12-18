import java.util.Scanner;

public class Main {
	
	static int counter;
	static int[] x,y;
	static int[][] height;
	static int resultX = 0,resultY = 0,resultH = 0;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		counter = scanner.nextInt();
		x = new int[counter];
		y= new int[counter];
		height = new int[101][101];
		
		for(int i = 0;i<counter;i++) {
			height[x[i] = scanner.nextInt()][y[i]= scanner.nextInt()] = scanner.nextInt();
		}
		
		check();
		
		System.out.println(resultX + " " + resultY + " " + resultH);
		
	}
	
	public static void check() {
		for(int i = 0;i<=100;i++) {
			for(int j = 0;j<=100;j++) {
				resultH = height[x[0]][y[0]] + Math.abs(i-x[0]) + Math.abs(j - y[0]);
				for(int k = 1;k<counter;k++) {
					int tmp =  height[x[k]][y[k]] + Math.abs(i-x[k]) + Math.abs(j - y[k]);
					
					if(resultH == tmp) {
						if(k == counter -1) {
							resultX = i;
							resultY = j;
							return;
						}
					}
					else break;
				}
			}
		}
	}
}