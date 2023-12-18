
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		long l=scn.nextLong();
		long r=scn.nextLong();
		if(2019<l||r<2019)
		System.out.println(((l%2019)*((l+1)%2019))%2019);
		else {
			System.out.println(0);
		}
	}

}
