import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] map = new int[14][14];
		
		while(sc.hasNext()){
			String s = sc.next();
			int x = Integer.valueOf(s.substring(0,1)) + 2;
			int y = Integer.valueOf(s.substring(2,3)) + 2;
			int z = Integer.valueOf(s.substring(4,5));
			map[y][x]++;
			map[y][x+1]++;
			map[y][x-1]++;
			map[y+1][x]++;
			map[y-1][x]++;
			if(z==2 || z==3){
				map[y+1][x+1]++;
				map[y+1][x-1]++;
				map[y-1][x+1]++;
				map[y-1][x-1]++;
			}
			if(z==3){
				map[y+2][x]++;
				map[y][x+2]++;
				map[y-2][x]++;
				map[y][x-2]++;	
			}
		}
		int max=0;
		int count=0;
		for(int i=2;i<12;i++){
			for(int j=2;j<12;j++){
				if(map[i][j]==0)count++;
				if(map[i][j]>max)max=map[i][j];
			}
		}
		System.out.println(count);
		System.out.println(max);
		
	}
}