import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int i;
		for(i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		for(i=0;i<n;i++){
			System.out.printf(a[n-i-1]+" ");
		}
		System.out.println();
		
	}
}