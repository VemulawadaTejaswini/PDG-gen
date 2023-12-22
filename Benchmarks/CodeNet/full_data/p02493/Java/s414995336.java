import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		int i;
		for(i=0;i<n;i++){
			a[i] = sc.nextInt();
					}
		Arrays.sort(a);
		i=0;
		while(i<n-1){
			System.out.print(a[i]+" ");
			i++;
		}
		System.out.println(a[n-1]);
		
	}
}