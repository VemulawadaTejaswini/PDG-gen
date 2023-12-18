import java.util.*;
import java.io.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
	
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i=0; i<n; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			for(int j=0; j<b; j++){
				arr.add(a);
			}
		}
		
		Integer kValue = (Integer) arr.get(k-1);
		System.out.println(kValue);
	}
}