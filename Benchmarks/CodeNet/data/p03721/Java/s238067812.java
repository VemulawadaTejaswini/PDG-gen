import java.util.*;
import java.io.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
	
		long[][] arr = new long[n][2];
		
		for(int i=0; i<n; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			arr[i][0] = a;
			arr[i][1] = b;
		}
		
		long kthIndex = arr[0][1];
		int index = 1;
		while((kthIndex < k) && (index<n)) {
			kthIndex += arr[index][1];
			index++;
		}
		
		System.out.println(arr[index-1][0]);
	}
}