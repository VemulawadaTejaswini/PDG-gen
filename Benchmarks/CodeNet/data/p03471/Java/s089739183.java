import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
        int y = sc.nextInt();
        for(int i = 0; i <= n; i++){
        	for(int j = 0; j <= n - i; j++){
            	int x = n - i - j;
                int sum = 10000 * i + 5000 * j + 1000 * x;
                if(sum == y){
                	System.out.println(i + " " + j + " " + x);
                    return;
                }
            }
        }
        System.out.println(-1 + " " + -1 + " " + -1);
    }
}