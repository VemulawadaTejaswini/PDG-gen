import java.io.*;
import java.util.*;

public class Main {
	public static void main ( String[] args ) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> List;
		while ( true ) {
			int remove = 0;
			List = new ArrayList<Integer>();
			int size = sc.nextInt();
			int space = sc.nextInt();
			if ( size == 0 && space == 0 ) break;
			space--;
			for ( int i = 1; i <= size; i++ )
				List.add(i);
			while ( List.size() != 1 ) {
				remove += space;
				while ( remove >= List.size() )
					remove -= List.size();
				List.remove(remove);
			}
			System.out.println(List.get(0));
		}
	}
}