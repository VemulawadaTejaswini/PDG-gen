import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String s = "";
			String t = "";
			String[][] map90 = new String[8][8];
			String[][] map180 = new String[8][8];
			String[][] map270 = new String[8][8];
			
			for(int i=0;i<8;i++){
				s = sc.next();
				for(int j=0;j<8;j++){
					t = s.substring(j,j+1);
					map90[j][7-i] = t;
					map180[7-i][7-j] = t;
					map270[7-j][i] = t;
				}
			}
			System.out.println("90");
			for(int i=0;i<8;i++){
				for(int j=0;j<8;j++){
					System.out.print(map90[i][j]);
				}
				System.out.println();
			}
			System.out.println("180");
			for(int i=0;i<8;i++){
				for(int j=0;j<8;j++){
					System.out.print(map180[i][j]);
				}
				System.out.println();
			}
			
			System.out.println("270");
			for(int i=0;i<8;i++){
				for(int j=0;j<8;j++){
					System.out.print(map270[i][j]);
				}
				System.out.println();
			}
	
		}
	}	
}