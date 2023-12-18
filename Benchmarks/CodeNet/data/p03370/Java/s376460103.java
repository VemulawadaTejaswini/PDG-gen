import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
        int g = sc.nextInt();
        int min = g;
        int count = 0;
        int sum = 0;
        for(int i = 0; i < n; i++){
        	int x = sc.nextInt();
            sum += x;
            if(min > x){
            	min = x;
            }
        }
        sum = g - sum;
        while(sum - min >= 0){
        	sum -= min;
            count++;
        }
        System.out.println(n + count);
    }
}