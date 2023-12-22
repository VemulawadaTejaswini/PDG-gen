import java.lang.*;
import java.util.*;

class MAIN{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(sanjo(n)); 
	}
	public static int sanjo(int x){
		int y = x * x * x;
		return y;
	}
}