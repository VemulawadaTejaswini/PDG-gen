import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			
			int h = Integer.parseInt(sc.next());
			int w = Integer.parseInt(sc.next());
			
			if(h == 0 && w == 0){
				break;
			}
			
			for(int i = 1; i<= h ;i++){
				
				for(int j = 1; j<=w; j++){
					
					String  frame= drawWindow(i,j,h,w);
					System.out.print(frame);
				}
				
				System.out.println("");
			}
			
			System.out.println("");
			
		}
		
		
		sc.close();
		
	}

	private static String drawWindow(int row, int column, int h, int w) {
		
		// first row and last row
		if(row == 1 || row == h){
			return "#";
		}
		
		if(column == 1 || column == w){
			return "#";
		}
		
		return ".";
	}

}
