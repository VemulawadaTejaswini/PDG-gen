import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt(), w = in.nextInt();
		int[][] a = new int[h][w];
		for(int i=0; i<h; i++){
			String s = in.next();
			for(int j=0; j<w; j++){	
				if(s.charAt(j)==35)
					a[i][j] = 1;			
			}			
		}		
		for(int i=0; i<h; i++){
			for(int j=0; j<w; j++){				
				System.out.print(a[i][j]+" ");				
			}	
			System.out.println();	
		}


	}

}