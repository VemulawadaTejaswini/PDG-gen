
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		String N=sc.nextLine();
		//System.out.println(N.length());
		String ans = "No";

		for(int i=0; i<N.length(); i++) {
			if(N.charAt(i) == '7') {
				ans = "Yes";
			}
		}

		System.out.println(ans);


		sc.close();


		}

	}


