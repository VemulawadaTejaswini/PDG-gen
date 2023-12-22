import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int v = sc.nextInt();
        int b = sc.nextInt();
        int w = sc.nextInt();
        int t = sc.nextInt();
        long oni = v * t + a;
        long nige = w * t + b;
        String ans = "No";
        if(a < b){
        	if(oni >= nige){
            	ans = "YES";
            }
        }else{
        	if(oni <= nige){
            	ans = "YES";
            }
        }
        System.out.println(ans);
    }
} 