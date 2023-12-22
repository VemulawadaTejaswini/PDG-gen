package id;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
	
	static int n=0;
	static int m=0;
	static int sum=0;
	static long cand=0;
	static ArrayList<Integer> a = new ArrayList<Integer>();
	static String id_str;
	static ArrayList<Character> id = new ArrayList<Character>();
	
	public static void main (String[] args){
		
		Scanner scan1 = new Scanner(System.in);
		
		n = scan1.nextInt();
		id_str = scan1.next();
		m = scan1.nextInt();
		for(int i=0; i<m; i++) a.add(scan1.nextInt());

		scan1.close();
		
		for(int i=0; i<n; i++) id.add(id_str.charAt(i));
		
		Collections.reverse(id);

		search(0);
		
		System.out.println(cand);
	}
	
	public static void search(int depth){

		if(depth<n){
			if(id.get(depth) == '*'){
				for(int i=0; i<m; i++){
					sum += a.get(i) + (a.get(i) - 9*(a.get(i)/5)) * (depth%2);
					depth++;
					search(depth);
					depth--;
					sum -= a.get(i) + (a.get(i) - 9*(a.get(i)/5)) * (depth%2);
				}
			}else{
				sum += Integer.parseInt("" + id.get(depth)) + (Integer.parseInt("" + id.get(depth)) - 9*(Integer.parseInt("" + id.get(depth))/5)) * (depth%2);
				depth++;
				search(depth);
				depth--;
				sum -= Integer.parseInt("" + id.get(depth)) + (Integer.parseInt("" + id.get(depth)) - 9*(Integer.parseInt("" + id.get(depth))/5)) * (depth%2);
			}
		}else{


			if(sum%10 == 0) cand++;

		}
	}
	
}