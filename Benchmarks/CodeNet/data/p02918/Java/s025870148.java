import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;


public class Main{
	 public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   int k = sc.nextInt();
	   String s = sc.next();
	   int sum = 1;
	   for(int i = 0; i < n-1; i++) {
		   if(s.charAt(i)==s.charAt(i+1)) {
			   sum++;
		   }
	   }
	   int ans = Math.min(sum+2*k, n-1);
	   System.out.println(ans);
	 }
	}