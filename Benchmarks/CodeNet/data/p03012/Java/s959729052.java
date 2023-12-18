import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b[]=new int[a];
		int max=0;
		for(int i=0;i<a;i++) {
			b[i]=scan.nextInt();
			max+=b[i];
		}
		int ans=1145141919;
		int co=0;
		for(int i=0;i<a;i++) {
			co+=b[i];
			if(Math.abs(co-(max-co))<ans) {
				ans=Math.abs(co-(max-co));
			}
		}
		System.out.println(ans);
		}
}
