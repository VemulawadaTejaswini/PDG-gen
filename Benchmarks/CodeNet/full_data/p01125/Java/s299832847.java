import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int gn = Integer.parseInt(sc.nextLine());
			if(gn == 0) {
				System.out.println();
				break;
			}
			
			int[][] xy = new int[21][21];
			for(int i=0; i < 21; i++){
				for(int j=0; j < 21; j++){
					xy[i][j] = 0;
				}
			}
			
			for(int i=0; i < gn; i++){
				String[] gp = sc.nextLine().split(" ");
				xy[Integer.parseInt(gp[0])][Integer.parseInt(gp[1])] = 1;
			}
				
			int mn = Integer.parseInt(sc.nextLine());
			String[] mt = new String[mn];
			int[] mc = new int[mn];
					
			for(int i=0; i < mn; i++){
				String[] mp = sc.nextLine().split(" ");
				mt[i] = mp[0];
				mc[i] = Integer.parseInt(mp[1]);
			}
			
			run(xy,mt,mc);
		}	
		sc.close();
	}
	
	
	static void run(int[][] xy,String[] mt,int[] mc){
		int xpoint = 10;
		int ypoint = 10;
		for(int i=0; i < mt.length; i++){
			switch(mt[i]){
				case "N" :
					for(int j=0;  j < mc[i]; j++){
						xy[xpoint][++ypoint] = 0;
					}
					break;
				case "E" :
					for(int j=0; j < mc[i]; j++){
						xy[++xpoint][ypoint] = 0;
					}
					break;
				case "S" :	
					for(int j=0; j < mc[i]; j++){
						xy[xpoint][--ypoint] = 0;
					}
					break;
				case "W" :
					for(int j=0; j < mc[i]; j++){
						xy[--xpoint][ypoint] = 0;
					}
					break;
			}
		}
		System.out.println(check(xy));
	}
	
	static String check(int[][] xy){
		for(int i=0; i < xy[0].length; i++){
			for(int j=0; j < xy.length; j++){
				if(xy[i][j] == 1) return "No";
			}
		}
		return "yes";
	}
	
}