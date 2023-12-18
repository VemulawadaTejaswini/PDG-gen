import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] array = new int[n], array2=new int[n];
		for(int i=0;i<n;i++) {
			array2[i]=sc.nextInt();
			array[i]=sc.nextInt();
		}
		sc.close();
		Arrays.sort(array);
		int mid1=array[n/2],mid2=array[n/2-1];
		for(int i=0;i<n;i++) {
			if(array2[i]<=mid2) System.out.println(mid1);
			else System.out.println(mid2);
		}
	}
}