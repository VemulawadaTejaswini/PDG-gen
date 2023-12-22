import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;



public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	   	String s = sc.next();
	   	long sum = 0;
	   	for(int i = 0; i < s.length()-3; i++) {
	   		int left = i;
		   	int right = i+4;
	   		while(right<=s.length()) {
		   		BigDecimal val = new BigDecimal(s.substring(left, right));
		   		BigDecimal mod = new BigDecimal(2019);
		   		BigDecimal rem = val.remainder(mod);
		   		//System.out.println(rem);
		   		if(rem.equals(new BigDecimal(0))) {
		   			left = right;
		   			right=left+3;
		   			sum++;
		   		}
		   		else {
		   			right++;
		   		}
		   	}
	   	}
	   	System.out.println(sum);
	}
}