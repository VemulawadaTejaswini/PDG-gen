import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int ans=1;
		for(double i=0;i!=a+1;i++) {
			if(Math.sqrt(i)==(int)Math.sqrt(i)) {
				ans=(int) i;
			}
		}
		System.out.println(ans);
	}
}