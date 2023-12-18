import java.util.Scanner;


public class Main {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();

		int max=max(a,b,c);


		int sum=a+b+c;

		int counter=0;

		while(true) {

			if(sum%3==0 && sum/3>=max) {
				break;
			}else {
				sum+=2;
				counter++;
			}

		}

		System.out.println(counter);

		sc.close();


	}

	public static int max(int a,int b,int c) {

		int buf=Math.max(a, b);

		return Math.max(buf,c);

	}


}
