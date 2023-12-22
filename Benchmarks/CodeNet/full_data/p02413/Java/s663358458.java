import java.util.*;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
    	int i, j;
    	int sum = 0, sum2 = 0;
    	int r = sc.nextInt();
    	int c = sc.nextInt();
    	int rc[][] = new int[r][c];
    		
    	for(i = 0; i < r; i++) {
    		for(j = 0; j < c; j++) {
    			rc[i][j] = sc.nextInt();
    			sum += rc[i][j];
    			System.out.print(rc[i][j] + " ");
    		}
    		System.out.println(sum);
    		sum = 0;
    	}
    	for(j = 0; j < c; j++) {
    		for(i = 0; i < r; i++) {
    			sum += rc[i][j];
    		}
    		System.out.print(sum + " ");
    		sum2 += sum;
    		sum = 0;
    	}
    	System.out.println(sum2);
    }
}
