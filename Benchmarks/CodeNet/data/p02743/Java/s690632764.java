import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long a = input.nextLong();
		long b = input.nextLong();
		long c = input.nextLong();
		long LS = 4*a*b;
		long RS = c-a-b; //Don't square pre-emptively
		System.out.println(LS<RS*RS&&RS>0?"Yes":"No");
		//Second component of if statement due to following counter:
		/*a=2,b=3,c=0 (Expected No, says yes due to negatives->Positive from squaring)
		 * */
	}
}