import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;



public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	   	int n = sc.nextInt();
	   	int A[] = new int[n];
	   	for(int i = 0; i < n-1; i++) {
	   		int a = sc.nextInt();
	   		A[a-1]++;
	   	}
	   	for(int i = 0; i < n; i++) {
	   		System.out.println(A[i]);
	   	}
	}
}