import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), a = sc.nextInt(),b=sc.nextInt();
		//int x=sc.nextInt();//,k=sc.nextInt();
		long sum=0,count=0,flag=0,max=-999999,min=99999;
		long[] array=new long[101];
		//String s=sc.next(),t=sc.next();
		String buff;
		//String[] arrays = new String[a];
		for(int i=1;i<=n;i++) {
			buff = String.valueOf(i);
			for(int j=0;j<buff.length();j++) {
				sum+=Integer.parseInt(buff.substring(j,j+1));
			}
			//System.out.println(sum);
			if(sum>=a&&sum<=b)count+=i;
			sum=0;
		}
		System.out.println(count);



	}
	public static int sample(int n) {
		return n;
	}

}
