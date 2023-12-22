import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main{

	public static void main(String args[]) throws NoSuchElementException{

		String st="";
		int yakusu;
		int bunkatu;
		long ans;
		while(true) {
				Scanner sc=new Scanner(System.in);
				st=sc.next();
				if(st==null) {
					System.exit(0);
				}
				yakusu=Integer.parseInt(st);
				bunkatu=600/yakusu;

				ans=0;
				for(int i=0; i<bunkatu; i++) {
					ans+=(yakusu*i)*(yakusu*i)*yakusu;
				}
				System.out.println(ans);

		}

	}
}
