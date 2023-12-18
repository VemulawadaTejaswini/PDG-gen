import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);static void p(int i) {System.out.println(i);}static void p(long i) {System.out.println(i);}static void p(String i) {System.out.println(i);}static void p(double i) {System.out.println(i);}
	
	
	public static void main(String[] args) {
		HashMap<String,Integer> map =new HashMap<>();
		int N=sc.nextInt();
		
		for(int i=0;i<N;i++) {
			String d=sc.next();
			
			if(map.containsKey(d)) {
				map.replace(d, map.get(d)+1);
			}else {
				map.put(d, 1);
			}
		}
		
		int M=sc.nextInt();
		boolean x=true;
		for(int i=0;i<M;i++) {
			String t=sc.next();
			if(map.containsKey(t)) {
				if(map.get(t)==1)map.remove(t);
				else map.replace(t, map.get(t)-1);
			}else {
				x=false;
				break;
			}
		}
		if(x)p("YES");
		else p("NO");
		
		
	}
	
}
	
