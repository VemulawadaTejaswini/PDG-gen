import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int max=scan.nextInt(),count=0;
		while(count<max){
			int x=scan.nextInt();
			int y=scan.nextInt();
			int matatabi=scan.nextInt();
			int map[][] = new int[x+1][y+1];
			
			for(int i=0;i<=x;i++){
				for(int j=0;j<=y;j++){
					map[x][y]=0;
				}
			}
			map[0][1]=1;
			map[1][0]=1;

			for(int i=0;i<matatabi;i++){
				int x1=scan.nextInt();
				int y1=scan.nextInt();
				int x2=scan.nextInt();
				int y2=scan.nextInt();
	
				map[x1][y1]--;
				map[x2][y2]--;
			}
			
			map[0][0]=0;

			for(int i=0;i<=x;i++){
				for(int j=0;j<=y;j++){
					if(i==0&&j==0){
					}
					else if(i==0&&j!=0){
						map[i][j]+=map[i][j-1];
					}
					else if(i!=0&&j==0){
						map[i][j]+=map[i-1][j];
					}
					else{
						map[i][j]+=map[i-1][j]+map[i][j-1];
					}
					//System.out.print(map[i][j]);
				}
				//System.out.println("");
			}	
			if(map[x][y]>0){
				System.out.println(map[x][y]);
			}
			else if(map[x][y]<=0){
				System.out.println("Miserable Hokusai!");
			}
			count++;
		}
	}
}