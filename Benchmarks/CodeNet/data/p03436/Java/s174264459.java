import java.util.*;


public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int hight = sc.nextInt();
		int width = sc.nextInt();
		int ans = 0;
		
		char[][] meiz = new char[hight][width];
		int[][] map = new int[hight][width];
		
		
			for(int j=0;j<hight;j++){
				String line = sc.next();
				for(int i=0;i<width;i++){
				
				meiz[j][i] = line.charAt(i);
				ans += (meiz[j][i]== '.' ? 1 : 0);
				map[j][i] = (meiz[j][i]== '.' ? 0 : -1);
				}
			}
		
			map[0][0] = 1;
			int cost=0;
			for(cost=1;map[hight-1][width-1]==0;cost++)
				for(int j=0;j<hight;j++)
					for(int i=0;i<width;i++){
				
						if(map[j][i]==cost) work(meiz,map,j,i,cost);
				
					}
			
			
			System.out.println(ans-cost);
//			for(int j=0;j<hight;j++){
//				for(int i=0;i<width;i++){
//				
//				System.out.print(map[j][i]);
//				}
//				System.out.println();
//			}
	}

	private static void work(char[][] meiz,int[][] map, int j, int i ,int cost) {
		// TODO 自動生成されたメソッド・スタブ
		
		if(j>0) check(meiz,map,j-1,i,cost);
		if(i>0) check(meiz,map,j,i-1,cost);
		if(j<meiz.length-1) check(meiz,map,j+1,i,cost);
		if(i<meiz[0].length-1) check(meiz,map,j,i+1,cost);
		
	}

	private static void check(char[][] meiz,int[][] map, int j, int i, int cost) {
		
		if(meiz[j][i]== '.')
			if(map[j][i]==0)
				map[j][i] = cost+1;
	}

	
}