import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    while (true) {
    	int n = scanner.nextInt();
    	int x = scanner.nextInt();
    	if (n == 0 && x == 0) {
    		break;
    	} else {
    		int y = 0;
    		int count = 0;
    		//System.out.println (n);
    		for (int i = n; i >= 3; i--) {
    			//System.out.println (i);
    			for (int j = i - 1; j >= 2; j--) {
    				for (int k = j - 1; k >= 1; k--) {
    					y = i + j + k;
    					if (y == x) {
    						count = count + 1;
    					}
    				}
    			}
    		}
    		System.out.println (count);
    	}
    }
  }
}

