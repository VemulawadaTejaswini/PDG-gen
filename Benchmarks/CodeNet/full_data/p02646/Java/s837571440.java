import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
        long v = sc.nextLong();
        long b = sc.nextLong();
        long w = sc.nextLong();
        long t = sc.nextLong();
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