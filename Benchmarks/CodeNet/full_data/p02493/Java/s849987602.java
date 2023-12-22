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
		i=n-1;
		while(i>=0){
			System.out.print(a[i]);
			if(i==0){
				System.out.println();
				break;
			}
			System.out.print(" ");
			i--;
		}
		
	}
}