import java.util.*;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int column = sc.nextInt();
		int dRow = sc.nextInt();
		int dColumn = sc.nextInt();
 
		if(row==dRow || column==dColumn) {
			System.out.println(0);
			return;
		}
		long[] ways = new long[column];
		ways[0] = 1;
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				if(i==0 && j==0) continue;
				else if(i>=row-dRow && j<dColumn) ways[j] = 0;
				else if(i==0) ways[j] = ways[j-1];
				else if(j==0) continue;
				else ways[j] = ways[j] + ways[j-1];
			}
		}
		System.out.println(ways[column-1]);
	}
}