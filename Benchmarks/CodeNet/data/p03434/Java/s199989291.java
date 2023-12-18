import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();//, b = sc.nextInt();
		//int x=sc.nextInt();//,k=sc.nextInt();
		long sum=0,count=0,flag=0,max=-999999,min=99999;
		long[] array=new long[a];
		//String s=sc.next();//,t=sc.next();
		String buff;
		//String[] arrays = new String[a];
		for(int i=0;i<a;i++) {
			array[i]=sc.nextInt();
		}
		Arrays.sort(array);
		for(int i=a-1;i>=0;i-=2) {
			sum+=array[i];
			if(i-1<0)break;
			count+=array[i-1];
		}

		System.out.println(sum-count);

	}
	public static int sample(int n) {
		return n;
	}

}
