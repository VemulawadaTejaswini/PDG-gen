import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		if(n >= m/2)
			System.out.println(m/2);
		else{
			System.out.println(n + (m-2*n)/4);
		}			
	}
}