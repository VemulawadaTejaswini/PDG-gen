import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 0, y, size, max = 0, cnt = 0;
		int[][] paper = new int[10][10];
		String[] strings;
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				paper[i][j] = 0;
			}
		}
		while(sc.hasNext()){
			strings = sc.next().split(",");
			x = Integer.parseInt(strings[0]);
			y = Integer.parseInt(strings[1]);
			size = Integer.parseInt(strings[2]);
			
			if(size == 1){
				if(y - 1 >= 0) paper[x][y - 1]++;
				for(int i = 0; i < 3; i++){
					if(x - 1 + i >= 0) paper[x - 1 + i][y]++;
				}
				if(y + 1 >= 0) paper[x][y + 1]++;
			}else if(size == 2){
				for(int i = 0; i < 3; i++){
					for(int j = 0; j < 3; j++){
						if(x - 1 + j >= 0 && y - 1 + i >= 0) paper[x - 1 + j][y - 1 + i]++;
					}
				}
			}else{
				for(int i = 0; i < 3; i++){
					for(int j = 0; j < 3; j++){
						if(x - 1 + j >= 0 && y - 1 + i >= 0) paper[x - 1 + j][y - 1 + i]++;
					}
				}
				if(y - 2 >= 0) paper[x][y - 2]++;
				if(x - 2 >= 0) paper[x - 2][y]++;
				if(x + 2 >= 0) paper[x + 2][y]++;
				if(y + 2 >= 0) paper[x][y + 2]++;
			}
		}
		
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				if(paper[j][i] == 0){
					cnt++;
				}
				else if(paper[j][i] > max){
					max = paper[j][i];
				}
			}
		}
		System.out.println(cnt);
		System.out.println(max);
	}
}