import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){

		solve_abc159_b();
	}
  
  	public static void solve_abc159_b(){

		Scanner sc = new Scanner(System.in);
		boolean ans = true;

		String s1 = sc.next();
		StringBuilder sb1  = new StringBuilder(s1);
		String a1 = sb1.reverse().toString();

		String s2 = s1.substring(0, (s1.length()-1)/2);
		StringBuilder sb2  = new StringBuilder(s2);
		String a2 = sb2.reverse().toString();

		String s3 = s1.substring((s1.length()+3)/2 - 1);
		StringBuilder sb3  = new StringBuilder(s3);
		String a3 = sb3.reverse().toString();

		if(!s1.equals(a1)) ans = false;
		if(!s2.equals(a2)) ans = false;
		if(!s3.equals(a3)) ans = false;

		if(ans) System.out.println("Yes");
		else System.out.println("No");

		sc.close();

	}
}