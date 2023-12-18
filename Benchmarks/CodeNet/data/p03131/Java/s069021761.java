import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);static void p(int i) {System.out.println(i);}static void p(long i) {System.out.println(i);}static void p(String i) {System.out.println(i);}static void p(double i) {System.out.println(i);}
	
	
	public static void main(String[] args) {
		
		long K=sc.nextInt();
		long A=sc.nextInt();
		long B=sc.nextInt();
		
		long ans=0;
		if(B-A>2) {
			long v=K-(A-1);
			ans+=A+(B-A)*((int)v/2)+v%2;
		}else {
			ans+=K+1;
		}
		p(ans);
		
	}
	
}
	
