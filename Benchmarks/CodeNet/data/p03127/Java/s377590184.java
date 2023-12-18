import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a1=new long[n];
		for(int i = 0; i<n; i++){
			long a = sc.nextLong();
			a1[i]=a;
		}
		Arrays.sort(a1);
		long a2=a1[0];
		for(int i = 0; i<n; i++){
			if(a1[i]%a2!=0){
				System.out.println(1);
				return;
			}
		}
		System.out.println(a2);
	}
}