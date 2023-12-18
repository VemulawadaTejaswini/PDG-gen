import java.util.*;
import java.math.*;

public class Main {
	public static long mod = 1000000007;
	public static int[] a = new int[1000010];
	
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        String s = cin.next();
        for(int i = 1; i <= n; i++){
        	a[i] = Integer.parseInt(String.valueOf(s.charAt(i-1)));
        }
        StringBuilder str = new StringBuilder(s.toString());
        while(n-- > 1){
        	StringBuilder S = new StringBuilder();
        	for(int i = 0; i < str.length()-1; i++){
            	int x = Integer.parseInt(String.valueOf(str.charAt(i)));
            	int y = Integer.parseInt(String.valueOf(str.charAt(i+1)));
            	String s1 = Integer.toString(Math.abs(x-y));
            	S.append(s1);
            }
        	str = S;
        }
        System.out.println(str);
    }
}
