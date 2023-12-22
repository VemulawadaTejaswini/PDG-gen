import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int l=sc.nextInt();
		
//		int[][][] map=new int[n+1][n+1][2];
		Maps[][] map=new Maps[n+1][n+1];
		int[][][] mapmap=new int[n+1][n+1][2];
//		boolean[][] sw=new boolean[n+1][n+1];
		
		for(int i=1;i<n+1;i++){
			for(int j=1;j<n+1;j++)map[i][j]=new Maps();
		}
	
		
		
		for(int i=0;i<m;i++){
			int x=sc.nextInt();
			int y=sc.nextInt();
			System.out.println(x+" "+y);
			
			int sub=sc.nextInt();
			map[x][y].length=sub;
			map[y][x].length=sub;
			mapmap[x][y][0]=sub;
			
			int sub2=sc.nextInt();
			map[x][y].enemy=sub2;
			map[y][x].enemy=sub2;
			mapmap[x][y][1]=sub2;
			
			if(map[x][y].length<l){
				map[x][y].frag=true;
				map[y][x].frag=true;
			}
		}
		
		
		for(int i=1;i<n+1;i++){
			for(int j=1;j<n+1;j++){
				for(int k=1;k<n+1;k++){
					if(i==j||i==k||j==k)continue;
					//if(map[i][j].length>map[i][k].length+map[k][j].length)map[i][j].length=map[i][k].length+map[k][j].length;
					if(map[i][j].enemy>map[i][k].enemy+map[k][j].enemy){
						map[i][j].enemy=map[i][k].enemy+map[k][j].enemy;
						
						map[j][i].enemy=map[i][k].enemy+map[k][j].enemy;
						
						map[i][j].length=map[i][k].length+map[k][j].length;
						map[j][i].length=map[i][k].length+map[k][j].length;
						
						
					}
					
				}	
			}
		}
		
		System.out.println(map[1][n].enemy);
			
		
/*		for(int i=1;i<n+1;i++){
			for(int j=1;j<n+1;j++){
				System.out.println(i+" "+j+" "+map[i][j].length+" "+map[i][j].enemy);
			}
		}*/
	}

}


class Maps{
	int length=10001;
	int enemy=10001;
	ArrayList<Integer> listl=new ArrayList<Integer>();
	ArrayList<Integer> liste=new ArrayList<Integer>();
	boolean frag=false;
	int risk=101;
	
	
}