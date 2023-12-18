import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();//,b=sc.nextInt();
		//int x=sc.nextInt();//,k=sc.nextInt();
		long sum=0,count=0,flag=0,max=-999999,min=99999;
		long[] array=new long[n];
		//String s=sc.next(),t=sc.next();
		String buff;
		//String[] arrays = new String[a];
		for(int i=0;i<n;i++) {
			flag=sc.nextLong();
			if(flag>=Math.abs(flag-k)) {
				sum+=Math.abs(flag-k)*2;
			}else {
				sum+=flag*2;
			}
		}
		System.out.println(sum);



	}
	public static int sample(int n) {
		return n;
	}

}
