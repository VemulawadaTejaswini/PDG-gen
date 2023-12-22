import java.util.Scanner;
public class Main{
	static int x,y,p,max = 0, minCount = 0;
	public static void main(String args[]){
		int map[][] = new  int [10][10];
		Scanner sc = new Scanner (System.in);
		while(sc.hasNext()){
			String input[] = sc.next().split(",");
			x = Integer.parseInt(input[0]);
			y = Integer.parseInt(input[1]);
			p = Integer.parseInt(input[2]);
			map[x][y]++;
			if(judge(x+1,y))map[x+1][y]++;
			if(judge(x-1,y))map[x-1][y]++;
			if(judge(x,y-1))map[x][y-1]++;
			if(judge(x,y+1))map[x][y+1]++;
			if(p >= 2){
				if(judge(x+1,y+1))map[x+1][y+1]++;
				if(judge(x-1,y-1))map[x-1][y-1]++;
				if(judge(x-1,y+1))map[x-1][y+1]++;
				if(judge(x+1,y-1))map[x+1][y-1]++;
			}
			if(p >= 3){
				if(judge(x+2,y))map[x+2][y]++;
				if(judge(x-2,y))map[x-2][y]++;
				if(judge(x,y+2))map[x][y+2]++;
				if(judge(x,y-2))map[x][y-2]++;
			}
		}
		for(int i = 0; i < 10;i++){
			for(int j = 0; j < 10; j++){
				if(map[i][j] == 0)minCount++;
				if(map[i][j]>max)max = map[i][j];
			}
		}
		System.out.println(minCount +"\n"+ max);
	}
	public static boolean judge(int x,int y){
		if(x < 0 || x > 9 || y < 0 || y > 9)return false;
		else return true;
	}
}