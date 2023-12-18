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

		solve_abc157_c();
	}
  
  	public static void solve_abc157_c(){

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int s[] = new int[3];
		
		for(int i=0;i<3;i++){
			s[i] = -1;
		}
		
		boolean ans = true;
		
		for(int i=0;i<M;i++){
			
			int c = sc.nextInt();
			int d = sc.nextInt();
			
			if(s[c-1] == -1 || s[c-1] == d) s[c-1] = d;
			else ans = false;
		}
		
		if(!ans){
			System.out.println("-1");
			sc.close();
			return;
		}

		if(N != 1 && s[3-N] == 0){
			System.out.println("-1");
			sc.close();
			return;
		}

		
		for(int i=3-N;i<3;i++){
			
			
			if(i == 3-N && N != 1 && s[i] == -1){
				s[i] = 1;
			}
			else if(s[i] == -1){
				s[i] = 0;
			}
			
			System.out.print(s[i]);
		}

		sc.close();

	}
}