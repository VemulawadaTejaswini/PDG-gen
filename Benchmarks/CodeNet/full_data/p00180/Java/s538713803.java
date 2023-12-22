import java.util.*;
public class Main {
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		new AOJ();
	}
	
	class  AOJ{
		ArrayList<Integer> gets;
		ArrayList<Integer> never;
		public AOJ(){
			Scanner in = new Scanner(System.in);
			while(true){
				int n = in.nextInt();//n-1までの街数
				int m = in.nextInt();//橋の数
				if(n+m==0)break;
				int[][] edge = new int[n][n];
				for(int i=0;i<n;i++)for(int s=0;s<n;s++)edge[i][s]=Integer.MAX_VALUE;
				for(int i=0;i<m;i++){
					int a=in.nextInt();
					int b=in.nextInt();
					edge[a][b]=in.nextInt();
					edge[b][a]=edge[a][b];
				}
				int result=0;
				int min[] = new int[n];
				boolean[] sw = new boolean[n];
				Arrays.fill(min,Integer.MAX_VALUE);
				sw[0] = true;
				for(int i=1;i<n;i++)if(!sw[i]&&min[i]>edge[i][0])min[i]=edge[i][0];
				while(true){
					int target = -1;
					for(int s=0;s<n;s++){
						if(!sw[s]&&(target==-1||min[target]>min[s])){
							target=s;
						}
					}
					if(target==-1)break;
					result+=min[target];
					sw[target]=true;
					for(int i=0;i<n;i++)if(!sw[i]&&min[i]>edge[i][target])min[i]=edge[i][target];
				}
				System.out.println(result);
			}
			
			
			
			
		}
	}
	
}