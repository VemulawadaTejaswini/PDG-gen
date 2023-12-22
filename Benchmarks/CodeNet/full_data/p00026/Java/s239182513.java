import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				scanner.useDelimiter(",|\\n");
		int x,y,plotSize;
		int paper[][] = new int[14][14];
		int zeroCellNum = 0;
		int mostDark = 0;
		while(scanner.hasNext()){
			x = 2 + scanner.nextInt();
			y = 2 + scanner.nextInt();
			plotSize = scanner.nextInt();
			System.out.println(x + " " + y + " " + plotSize);
			paper[x][y]++;
			paper[x+1][y]++;
			paper[x-1][y]++;
			paper[x][y+1]++;
			paper[x][y-1]++;
			if(plotSize >= 2){
				paper[x+1][y+1]++;
				paper[x+1][y-1]++;
				paper[x-1][y+1]++;
				paper[x-1][y-1]++;
			}
			if(plotSize == 3){
				paper[x+2][y]++;
				paper[x-2][y]++;
				paper[x][y+2]++;
				paper[x][y-2]++;
			}
		}
		for(int i=2; i<12; i++){
			for(int j=2; j<12; j++){
				if(paper[i][j] == 0){
					zeroCellNum++;
					System.out.println("i=" + i + " j=" + j);
				}
				if(paper[i][j] > mostDark){
					mostDark = paper[i][j];
				}
			}
		}
		System.out.println(zeroCellNum);
		System.out.println(mostDark);
	}
}