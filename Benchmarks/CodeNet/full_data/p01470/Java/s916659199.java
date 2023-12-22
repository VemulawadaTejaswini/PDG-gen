import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static class Rational{
		BigInteger upper, lower;

		public Rational(long upper, long lower) {
			super();
			this.upper = new BigInteger(upper + "");
			this.lower = new BigInteger(lower + "");
		}
		
		public void optimal(){
			BigInteger gcd = upper.gcd(lower);
			upper = upper.divide(gcd);
			lower = lower.divide(gcd);
		}
		
		public void add(int x){
			BigInteger add_v = new BigInteger(x + "").multiply(lower);
			upper = upper.add(add_v);
			optimal();
		}
		
		public void sub(int x){
			add(-x);
		}
		
		public void mul(int x){
			BigInteger mul_v = new BigInteger(x + "");
			upper = upper.multiply(mul_v);
			optimal();
		}
		
		public void div(int x){
			BigInteger div_v = new BigInteger(x + "");
			lower = lower.multiply(div_v);
			optimal();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		
		Rational raito = new Rational(0, 1);
		
		for(int i = 0; i < N; i++){
			final int ops = sc.nextInt();
			final int value = sc.nextInt();
			
			if(ops == 1){
				raito.add(value);
			}else if(ops == 2){
				raito.sub(value);
			}else if(ops == 3){
				raito.mul(value);
			}else if(ops == 4){
				raito.div(value);
			}
		}
		
		System.out.println(raito.upper);
	}

}