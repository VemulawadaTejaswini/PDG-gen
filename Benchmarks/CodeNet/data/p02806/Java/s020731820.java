
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s[]=new String[n];
		int t[]=new int[n];
		for(int i=0;i<n;i++) {
			s[i]=scan.next();
			t[i]=scan.nextInt();
		}
		String x=scan.next();
		scan.close();
		int cnt=0;
		int check=0;
		for(int i=0;i<n;i++) {
			if(check==1)cnt+=t[i];
			if(x.equals(s[i])==true)check=1;

		}
		System.out.println(cnt);

	}

}