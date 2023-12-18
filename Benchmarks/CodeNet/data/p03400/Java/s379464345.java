import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), d = sc.nextInt();
		int x=sc.nextInt();//,k=sc.nextInt();
		long sum=0,count=0,flag=0,max=-999999,min=99999;
		long[] array=new long[n];
		//String[] array = new String[n];
		//String s=sc.next();//,t=sc.next();
		for(int i=0;i<n;i++) {
			array[i]=sc.nextLong();
		}
		for(int i=0;i<n;i++) {
			int j=0;
			while(count<d) {
				count=j*array[i]+1;
				if(count>d)break;
				sum++;
				j++;
			}
			count=0;
		}

		System.out.println(sum+x);
	}
	public static int sample(int n) {
		return n;
	}

}
