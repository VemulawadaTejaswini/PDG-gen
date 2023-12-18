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
		   		long val = Long.parseLong(s.substring(left, right));
		   		//System.out.println(val);
		   		if(val%2019==0) {
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