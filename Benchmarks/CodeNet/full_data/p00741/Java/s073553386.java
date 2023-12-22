
import java.util.Scanner;


public class Main {

	private static Scanner sc = new Scanner(System.in);

	
	public static void main(String[] argv){
		new Main().cal();
	}
	
	private void cal(){
		
		
		for(;;){
		int w=sc.nextInt();
		int h=sc.nextInt();
		
		if(w==0 && h==0)
				break;	
		
		int[][] map=new int[h][w];
		boolean[][] checked=new boolean[h][w];
		int count=0;
		
		for(int i=0;i<map.length;i++) 
			for(int j=0;j<map[0].length;j++)
				map[i][j]=sc.nextInt();
		
		for(int i=0;i<map.length;i++)
			for(int j=0;j<map[0].length;j++){
				if(checked[i][j])
					continue;
				else{
					count+=add(map,checked,i,j);
				}
					
			}
		
			System.out.println(count);
		
		}
		
	}
	
	private int add(int[][] map,boolean[][] checked,int i, int j){
	    if(i>=0 && i<map.length && j>=0 && j<map[0].length && map[i][j]==1 && !checked[i][j]){
		
			checked[i][j]=true;
			add(map,checked,i+1,j);
			add(map,checked,i,j+1);
			add(map,checked,i-1,j);
			add(map,checked,i,j-1);
			add(map,checked,i+1,j+1);
			add(map,checked,i+1,j-1);
			add(map,checked,i-1,j+1);
			add(map,checked,i-1,j-1);
			return 1;
		}
		return 0;
		
			
			
	}
	
}