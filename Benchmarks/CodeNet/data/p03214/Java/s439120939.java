import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        double ave = 0;
        for(int i = 0; i < n; i++){
        	num[i] = sc.nextInt();
            ave += num[i];
        }
        ave = ave / n;
        double ans = num[0];
        int ans0 = 0;
        for(int i = 1; i < n; i++){
            double difnum = Math.abs(num[i] - ave);
        	if(ans > difnum){
            	ans = difnum;
                ans0 = i - 1;
            }
        }
        System.out.println(ans0);
    }
}