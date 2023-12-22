 import java.util.Scanner; 
2 
 
3 public class Main { 
4 	public static void main(String[] args) { 
5 		Scanner scn = new Scanner(System.in); 
6 		int n = scn.nextInt(); 
7 		int debt = 100; 
8 		for (int i = 0; i < n; i++) { 
9 			debt = (int)Math.ceil(debt * 1.05); 
10 		} 
11 		System.out.println(debt * 1000); 
12 	} 
13 } 