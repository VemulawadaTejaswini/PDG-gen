import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int rows = in.nextInt();
		int cols = in.nextInt(); in.nextLine();
		char[][] fig = new char[rows][cols];
		
		String s = "";
		for ( int i = 0; i < rows; i++ ) {
			s = in.nextLine();
			for ( int j = 0; j < cols; j++ ) {
				fig[i][j] = s.charAt(j);
			}
		}
		// System.out.println(Arrays.deepToString(fig));
		
		boolean possible = true;
		
		for ( int i = 0; i < rows; i++ ) {
			for ( int j = 0; j < cols; j++ ) {
				if ( fig[i][j] == '#' && i == 0 && j == 0 ) { //upper left corner
					if ( fig[i][j+1] == '.' && fig[i+1][j] == '.' )
						possible = false;
				} else if ( fig[i][j] == '#' && i == 0 && j == cols-1 ) { //upper right corner
					if ( fig[i][j-1] == '.' && fig[i+1][j] == '.' )
						possible = false;
				} else if ( fig[i][j] == '#' && i == rows-1 && j == 0 ) { //lower left corner
					if ( fig[i][j+1] == '.' && fig[i-1][j] == '.' )
						possible = false;
				} else if ( fig[i][j] == '#' && i == rows-1 && j == cols-1 ) { // lower right corner
					if ( fig[i][j-1] == '.' && fig[i-1][j] == '.' )
						possible = false;
				} else if ( fig[i][j] == '#' &&  i == 0) { // upper edge
					if ( fig[i+1][j] == '.' && fig[i][j-1] == '.' && fig[i][j+1] == '.')
						possible = false;
				} else if ( fig[i][j] == '#' && i == rows-1 ) { // lower edge
					if ( fig[i-1][j] == '.' && fig[i][j-1] == '.' && fig[i][j+1] == '.') 
						possible = false;
				} else if ( fig[i][j] == '#' && j == 0 ) { // left edge
					if ( fig[i][j+1] == '.' && fig[i-1][j] == '.' && fig[i+1][j] == '.' ) 
						possible = false;
				} else if ( fig[i][j] == '#' && j == cols-1 ) { // right edge
					if ( fig[i][j-1] == '.' && fig[i-1][j] == '.' && fig[i+1][j] == '.' )
						possible = false;
				} else if ( fig[i][j] == '#' ) {// center tiles
					if ( fig[i][j+1] == '.' && fig[i][j-1] == '.' && fig[i+1][j] == '.' && fig[i-1][j] == '.' )
						possible = false;
				}
			}
		}
		
		if (possible)
			System.out.println("Yes");
		else
			System.out.println("No");
		
	}
}