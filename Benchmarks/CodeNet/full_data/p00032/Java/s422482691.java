import java.util.Scanner;


public class Main {

	static Scanner sc = new Scanner( System.in );
	
	public static void main(String[] args) {
		
		int rectangle=0, diamond=0;
		
		while( sc.hasNextLine() ) {
			
			String tmp[] = sc.nextLine().split(",");
			int line[] = new int[tmp.length];
			
			for ( int i=0; i < tmp.length; i++ ) {
				line[i] = Integer.valueOf( tmp[i] );
			}
			
			if ( line[0] == line[1] ) {
				diamond++;
			} else if ( ( line[0] + line[1] ) == line[2] ) {
				rectangle++;
			}
		}
		
		System.out.println( rectangle );
		System.out.println( diamond );
		
	}

}