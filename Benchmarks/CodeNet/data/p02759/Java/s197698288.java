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

		solve_abc157_a();
	}
  
  	public static void solve_abc157_a(){

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		if(N % 2 == 1) N += 1;
		
		int ans = N / 2;
		
		System.out.println(ans);
		
		sc.close();
	}
}
