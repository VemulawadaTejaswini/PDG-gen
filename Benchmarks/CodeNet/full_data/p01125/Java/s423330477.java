import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while(true){
			String result ="No";
			int gems_number = sc.nextInt();
			if(gems_number==0) break;
			int gems_checker =0;
			int[][] gems = new int[21][21];
			//Arrays.fill(gems,0);
			for(int i=0;i<gems_number;i++){
				int x = sc.nextInt();
				int y = sc.nextInt();
				gems[x][y] = 1;
			}
			int operation_counter = sc.nextInt();
			int xx=10,yy=10;
			for(int i=0;i<operation_counter;i++){
				String dir = sc.next();
				int dis = sc.nextInt();
				//check(dis,xx,yy,gems,dir,gems_checker,gems_number,result);
				if(result.equals("No")){
					if(dir.equals("N")){
						for(int j=1;j<=dis;j++){
							yy++;
							if(gems[xx][yy]==1){
								gems_checker++;
								gems[xx][yy]=0;
							}
							if(gems_number ==gems_checker){
								result = "Yes";
								break;
							}
						}
					}else if(dir.equals("S")){
						for(int j=1;j<=dis;j++){
							yy--;
							if(gems[xx][yy]==1){
								gems_checker++;
								gems[xx][yy]=0;
							}
							if(gems_number ==gems_checker){
								result = "Yes";
								break;
							}
						}
					}else if(dir.equals("W")){
						for(int j=1;j<=dis;j++){
							xx--;
							if(gems[xx][yy]==1){
								gems_checker++;
								gems[xx][yy]=0;
							}
							if(gems_number ==gems_checker){
								result = "Yes";
								break;
							}
						}
					}else{
						for(int j=1;j<=dis;j++){
							xx++;
							if(gems[xx][yy]==1){
								gems_checker++;
								gems[xx][yy]=0;
							}
							if(gems_number ==gems_checker){
								result = "Yes";
								break;
							}
						}
					}
				}
				//if(result.equals("Yes")) break;
			}
			System.out.println(result);
		}
	}
}