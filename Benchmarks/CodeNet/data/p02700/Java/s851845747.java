
import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;



public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	   	int a = sc.nextInt();
	   	int b = sc.nextInt();
	   	int c = sc.nextInt();
	   	int d = sc.nextInt();
	   	while(a>0&&c>0) {
	   		a=a-d;
	   		c=c-b;
	   	}
	   	if(a<=0&&c<=0) {
	   		System.out.println("Yes");
	   	}
	   	else if(a<=0&&c>0) {
	   		System.out.println("No");
	   	}
	   	else if(c<=0&&a>0) {
	   		System.out.println("Yes");
	   	}
	 }
}