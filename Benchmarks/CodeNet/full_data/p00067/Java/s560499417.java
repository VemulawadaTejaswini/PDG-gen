import java.util.Scanner;

public class Main {

	final static int Row = 12;
	final static int Col = 12;
	
	static int[][] field = new int[Row+2][Col+2];
	
	enum Direction{
		Right(0,1),Down(1,0),Left(0,-1),Up(-1,0);
		
		int r,c;
		
		Direction(int r,int c){
			this.r=r;
			this.c=c;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while( sc.hasNext()) {
			for(int r=1;r<=Row;r++) {
				String str=sc.nextLine();
				if("".equals(str))str=sc.nextLine();
				char[] value = str.toCharArray();
				for(int c=1;c<=Col;c++) {
					field[r][c]=Character.getNumericValue(value[c-1]);
				}
			}
			System.out.println(CountIslands());
			
		}
	}
	
	static int CountIslands(){
		int islandCount=0;
		for(int r=1;r<=Row;r++) {
			for(int c=1;c<=Col;c++) {
				if(FourDirectionSearch(r,c)) {
					islandCount++;
				}
			}
		}
		return islandCount;
		
	}
	
	static boolean FourDirectionSearch(int r,int c){
		if(field[r][c]==1) {
			field[r][c]=0;
			
			for(Direction d:Direction.values()) {
				FourDirectionSearch(r+d.r,c+d.c);
			}
			
			return true;
		}
		return false;
		
	}

}

