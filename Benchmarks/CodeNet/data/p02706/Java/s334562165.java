import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;



public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	   	int n = sc.nextInt();
	   	int m = sc.nextInt();
	   	int sum = 0;
	   	for(int i = 0; i < m; i++) {
	   		int a = sc.nextInt();
	   		sum+=a;
	   	}
	   	sum = n-sum;
	   	if(sum < 0) {
	   		System.out.println(-1);
	   	}
	   	else {
	   		System.out.println(sum);
	   	}
	}
}