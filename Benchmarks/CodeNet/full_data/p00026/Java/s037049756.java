import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] Map = new int[14][14];
		while(sc.hasNext()){
			String temp = sc.nextLine();
			String[] str = temp.split(",");
			int x = Integer.parseInt(str[0])+2;
			int y = Integer.parseInt(str[1])+2;
			int size = Integer.parseInt(str[2]);
			if(size >= 1){
				Map[x][y]++;
				Map[x-1][y]++;
				Map[x+1][y]++;
				Map[x][y-1]++;
				Map[x][y+1]++;
			}
			if(size >= 2){
				Map[x-1][y-1]++;
				Map[x-1][y+1]++;
				Map[x+1][y-1]++;
				Map[x+1][y+1]++;
			}
			if(size >= 3){
				Map[x][y-2]++;
				Map[x][y+2]++;
				Map[x-2][y]++;
				Map[x+2][y]++;
			}
			int rem=0, max=0;
			for (int i = 2; i < 12; i++) {
				for(int j = 2; j < 12; j++){
					if(Map[i][j] == 0) rem++;
					else if(Map[i][j] > max) max = Map[i][j];
				}
			}
			System.out.println(rem);
			System.out.println(max);
		}

	}
}