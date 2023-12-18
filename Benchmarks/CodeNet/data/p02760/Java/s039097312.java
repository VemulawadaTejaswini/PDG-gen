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

		solve_abc157_b();
	}
  	public static void solve_abc157_b(){

		Scanner sc = new Scanner(System.in);
		
		int A[][] = new int[3][3];
		boolean c[][] = new boolean[3][3];
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				A[i][j] = sc.nextInt();
			}
		}
		
		
		int N = sc.nextInt();
		
		int b = 0;
		
		for(int i=0;i<N;i++){
			
			b = sc.nextInt();
			
			for(int x=0;x<3;x++){
				for(int y =0;y<3;y++){
					
					if(A[x][y] == b){
						c[x][y] = true;
					}
				}
			}
		}
		
		boolean ans = false;
		
		if(c[0][0] && c[0][1] && c[0][2]) ans = true; 
		if(c[1][0] && c[1][1] && c[1][2]) ans = true; 
		if(c[2][0] && c[2][1] && c[2][2]) ans = true; 
		if(c[0][0] && c[1][0] && c[2][0]) ans = true; 
		if(c[0][1] && c[1][1] && c[2][1]) ans = true; 
		if(c[0][2] && c[1][2] && c[2][2]) ans = true; 
		if(c[0][0] && c[1][1] && c[2][2]) ans = true; 
		if(c[2][0] && c[1][1] && c[0][2]) ans = true; 
		
		if(ans) System.out.println("Yes");
		else System.out.println("No");


		sc.close();

	}
}