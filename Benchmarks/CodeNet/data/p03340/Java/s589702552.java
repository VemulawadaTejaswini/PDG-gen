import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		long[] ar=new long[n];
		for(int i=0;i<n;i++){
			ar[i]=scn.nextLong();
		}
		int count = 0;
		for(int i=0;i<n;i++){
			long xor=ar[i];
			long sum = ar[i];
			for(int j=i+1;j<n;j++){
				xor^=ar[j];
				sum+=ar[j];
				if(xor==sum){
					count++;
				}
			}
		}
		System.out.println(count+n);
	}
}