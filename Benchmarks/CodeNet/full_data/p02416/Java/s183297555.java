import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			String x=sc.nextLine();
			int ans=0;
			if(x.equals("0")) {
				break;
			}
			for(int i=0;i<x.length();i++) {
				ans+=Character.digit(x.charAt(i),10);
			}
			System.out.println(ans);
		}
	}
}
