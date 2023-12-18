import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
        int time[] = new int[n];
        for(int i = 0; i < n; i++){
        	time[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for(int i = 0; i < k; i++){
        	int p = sc.nextInt();
            int a = time[p - 1];
            time[p - 1] = sc.nextInt();
            int sum = 0;
            for(int j = 0; j < n; j++){
            	sum += time[j];
            }
            System.out.println(sum);
            time[p - 1] = a;
        }
    }
}