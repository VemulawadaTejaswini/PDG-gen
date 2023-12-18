import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] array=new int[n];
		String buff;
		long count=0,sum=0;

		for(int i=0;i<n;i++) {
			buff=sc.next();
			for(int j=0;j<10;j++) {
				array[i]+=buff.charAt(j);
			}
		}
		Arrays.sort(array);
		for(int i=0;i<n-1;i++) {
			if(array[i]==array[i+1])count++;
			else {
				if(count>=1) {
					sum+=(long)(0.5*count*(count+1));
				}
				count=0;
			}
			//System.out.println("count:"+count+" sum:"+sum);
		}
		if(count!=0)sum+=(long)(0.5*count*(count+1));
		System.out.println(sum);
		//System.out.println(Arrays.toString(array));
	}
}

