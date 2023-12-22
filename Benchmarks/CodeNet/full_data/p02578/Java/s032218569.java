
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		int  n=ob.nextInt();
		long a[]=new long[n];
		for(int i=0;i<a.length;i++){a[i]=ob.nextLong();}
		Arrays.sort(a);
		long sum=0;
		for(int i=0;i<a.length-1;i++){sum=sum+(a[i+1]-a[i]);}
		System.out.println(sum);
		
	}
}
