import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//, a = sc.nextInt(),b=sc.nextInt();
		//int x=sc.nextInt();//,k=sc.nextInt();
		long sum=0,count=0,flag=0,max=-999999,min=99999;
		long[] array=new long[87];
		//String s=sc.next(),t=sc.next();
		String buff;
		//String[] arrays = new String[a];
		array[0]=2;
		array[1]=1;
		for(int i=2;i<87;i++) {
			array[i]=array[i-1]+array[i-2];
		}
		System.out.println(array[n]);



	}
	public static int sample(int n) {
		return n;
	}

}
