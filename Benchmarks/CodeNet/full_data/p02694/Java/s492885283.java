import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long count = 0;
		long money = 100;
		while(money<x) {
			money=money+money/100;
			count++;
		}
		System.out.println(count);
	 }
}