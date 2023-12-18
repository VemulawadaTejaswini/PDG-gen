import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long l = sc.nextInt();
		long r = sc.nextInt();
		long min=2020;
		int[] a=new int[100000000];
		int j=0;
		for(long i=l;i<=r;i++) {
			a[j]=(int)i%2019;
			j++;
		}
		Arrays.sort(a);
		min=a[0]*a[1];
		System.out.println(min);
	}
}