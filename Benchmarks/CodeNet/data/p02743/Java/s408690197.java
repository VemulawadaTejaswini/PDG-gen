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

		solve_abcPpc_c();
	}
  
  	public static void solve_abcPpc_c(){

		Scanner sc = new Scanner(System.in);

		double a = Math.sqrt((double)sc.nextLong());
		double b = Math.sqrt((double)sc.nextLong());
		double c = Math.sqrt((double)sc.nextLong());

		String ans = "No";

		if((a + b) < c){
			ans = "Yes";
		}

		System.out.println(ans);

		sc.close();

	}
}