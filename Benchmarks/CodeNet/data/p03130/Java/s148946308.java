import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	int[] g = new int[4];
    	int maxOverlap = 0;
    	
    	Scanner in = new Scanner(System.in);
    	
    	for (int i = 0; i < 6; i++) {
    		int tmp = Integer.parseInt(in.next()) -1;
    		
    		g[tmp]++;
    		maxOverlap = Math.max(maxOverlap, g[tmp]);
    	}
    	
    	if (maxOverlap == 2) System.out.println("YES");
    	else System.out.println("NO");
    }
}
