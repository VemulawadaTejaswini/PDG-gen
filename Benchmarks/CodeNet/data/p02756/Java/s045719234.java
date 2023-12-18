import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){

		solve_abc158_d();
	}
  
  	public static void solve_abc158_d(){

		Scanner sc = new Scanner(System.in);

		
		StringBuilder sb = new StringBuilder(sc.next());
		int q = sc.nextInt();
		
		boolean rev = false;
		
		for(int i=0;i<q;i++){
			
			int t = sc.nextInt();
			
			if(t == 1){
				rev = !rev;
			}
			else if(t == 2){
				int f = sc.nextInt();
				
				
				if((f == 1 && !rev ) || (f == 2 && rev)){
					/*
					StringBuilder sbtmp = new StringBuilder(sc.next());
					sbtmp.append(sb);
					sb = sbtmp;
					*/
					sb.insert(0, sc.next());
				}
				else {
					sb.append(sc.next());
				}
			}
		}
		
		if(rev) sb.reverse();
		
		System.out.println(sb);

		sc.close();

	}
}