import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[][] jpg;
		int countCase = 1;
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			jpg = new int[n][n];
			int x = 0;
			int y = 0;
			jpg[y][x++] = 1;
			boolean fl = true;
			for(int i = 2;i <= n*n;i++){
				if(i == 2){
					jpg[y][x] = i;
				}else if(fl){
					jpg[++y][--x] = i;
					if(x == 0 || x == n-1){
						if(y != n-1){
							jpg[++y][x] = ++i;
						}else{
							jpg[y][++x] = ++i;
						}
						fl = false;
					}else if(y == n-1){
						jpg[y][++x] = ++i;
						fl = false;
					}
				}else if(!fl){
					jpg[--y][++x] = i;
					if(y == 0 || y == n-1){
						if(x != n-1){
							jpg[y][++x] = ++i;
						}else{
							jpg[++y][x] = ++i;
						}
						fl = true;
					}else if(x == n-1){
						jpg[++y][x] = ++i;
						fl = true;
					}
				}
			}
			System.out.println("Case " + countCase + ":");
			for(int i = 0;i < n;i++){
				for(int j = 0;j < n;j++){
					System.out.printf("%3d",jpg[i][j]);
				}
				System.out.println();
			}
			countCase++;
		}
	}
}