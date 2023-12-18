import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String s=scan.next();
		
		if(n==1) {
			System.out.println(0);
			return;
		}
		//how many west/east from 0...i
		int[] west=new int[n];
		int[] east=new int[n];
		
		int w=0, e=0;
		for(int i=0;i<n;i++) {
			west[i]=i==0?0:west[i-1];
			east[i]=i==0?0:east[i-1];
			
			if(s.charAt(i)=='W') {
				west[i]++;
				w++;
			}
			else {
				east[i]++;
				e++;
			}
		}
//		System.out.println(Arrays.toString(west));
//		System.out.println(Arrays.toString(east));
		
		int res=west[n-1];
		if(n>1) res=Math.min(res,e-east[1]);
		
		for(int i=1;i<n-1;i++) {
			res=Math.min(res,west[i-1]+e-east[i+1]);
		}
		System.out.println(res);
	}
}