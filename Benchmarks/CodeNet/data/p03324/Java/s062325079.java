import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), d = sc.nextInt();
		int sum=0,count=0,flag=0,max=-999999,min=99999;
		//String[] array = new String[N];
		//String s=sc.next(),t=sc.next(),buff="";
		if(d==0) {
			System.out.println(n);
			System.exit(0);
		}
		if(d==1) {
			while(count!=n) {
				sum+=100;
				count++;
			}
			System.out.println(sum);
			sum=0;
			count=0;
		}else {
			while(count!=n) {
				sum+=10000;
				count++;
			}
			System.out.println(sum);
		}
		/*if(Integer.parseInt(s)%sum==0) {
			System.out.println("Yes");//Yes or YES注意
		}else {
			System.out.println("No");
		}*/

		//System.out.println("No");

	}
	public static int sample(int n) {
		return n;
	}

}
