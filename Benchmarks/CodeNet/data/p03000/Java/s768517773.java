import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        
        List<Integer> l = new ArrayList<Integer>();
        
        for(int i = 0; i< n; i++) {
        	l.add(scanner.nextInt());
        }
        int currentPlace = 0;
        int c = 0;
        while( currentPlace <= x) {
        	currentPlace = d(currentPlace,l.get(c));
        			c++;
        }
        
        System.out.println(c);
    }
    
    private static int d(int d, int l) {
		return d + l;
	}
}