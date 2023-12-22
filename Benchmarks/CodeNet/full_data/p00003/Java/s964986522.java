import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i = 0;i<num;i++){
			int max = 0;
			int a=scan.nextInt();
			int b=scan.nextInt();
			if(b>max)max=1;
			int c=scan.nextInt();
			if(c>max)check(c,a,b);
			else if(max==1) check(b,a,c);
			else check(a,b,c);
		}
	}
	private static void check(int max,int a,int b){
		if(a==0||b==0||max==0)
			System.out.println("NO");
		else if(max*max==a*a+b*b)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}