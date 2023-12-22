import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String s = "";
			int[][] map90 = new int[8][8];
			int[][] map180 = new int[8][8];
			int[][] map270 = new int[8][8];
			
			for(int i=0;i<8;i++){
				s = sc.next();
				for(int j=0;j<8;j++){
					if(s.codePointAt(j)==35){
						map90[j][7-i] = 1;
						map180[7-i][7-j] = 1;
						map270[7-j][i] = 1;
					}
				}
			}
			System.out.println("90");
			for(int i=0;i<8;i++){
				for(int j=0;j<8;j++){
					if(map90[i][j]==1) System.out.print("#");
					else System.out.print("*");
				}
				System.out.println();
			}
			System.out.println("180");
			for(int i=0;i<8;i++){
				for(int j=0;j<8;j++){
					if(map180[i][j]==1) System.out.print("#");
					else System.out.print("*");
				}
				System.out.println();
			}
			
			System.out.println("270");
			for(int i=0;i<8;i++){
				for(int j=0;j<8;j++){
					if(map270[i][j]==1) System.out.print("#");
					else System.out.print("*");
				}
				System.out.println();
			}
	
		}
	}	
}