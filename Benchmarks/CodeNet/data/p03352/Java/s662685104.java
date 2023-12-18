import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//, n = sc.nextInt();
		int sum=0,count=2,flag=0,max=-999999,min=99999;
		//String[] array = new String[n];
		//String s=sc.next();//,t=sc.next();
		String buff1,buff2;
		while(sum<n) {
			sum=count*count;
			if(sum>n) {
				sum=(count-1)*(count-1);
				break;
			}
			count++;
		}

		System.out.println(sum);

	}
	public static int sample(int n) {
		return n;
	}

}
