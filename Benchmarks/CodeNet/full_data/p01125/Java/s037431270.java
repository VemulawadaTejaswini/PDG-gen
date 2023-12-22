import java.util.Scanner;
public class vaa {
	public static void main(String[] args){
		int[][] field = new int[21][21];
		Scanner sc = new Scanner(System.in);
		while(true){
			int nowx = 10;
			int nowy = 10;
			for(int i=0;i<21;i++){
				for(int j=0;j<21;j++){
					field[i][j] = 0;
				}
			}
			int n = sc.nextInt();
			if(n == 0) break;
			for(int i=0;i<n;i++){
				int x = sc.nextInt();
				int y = sc.nextInt();
				field[x][y] = 1;
			}
			int m = sc.nextInt();
			for(int i=0;i<m;i++){
				String h = sc.next();
				int l = sc.nextInt();
				switch(h){
				case "N":
					for(int j=0;j<l;j++){
						nowy++;
						if(field[nowx][nowy] == 1){
							n--;
							field[nowx][nowy] = 0;
						}
					}
					break;
				case "S":
					for(int j=0;j<l;j++){
						nowy--;
						if(field[nowx][nowy] == 1){
							n--;
							field[nowx][nowy] = 0;
						}
					}
					break;
				case "E":
					for(int j=0;j<l;j++){
						nowx++;
						if(field[nowx][nowy] == 1){
							n--;
							field[nowx][nowy] = 0;
						}
					}
					break;
				case "W":
					for(int j=0;j<l;j++){
						nowx--;
						if(field[nowx][nowy] == 1){
							n--;
							field[nowx][nowy] = 0;
						}
					}
					break;
				}
			}
			if(n == 0) System.out.println("Yes");
			else System.out.println("No");
		}
	}
}