import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	long n = sca.nextLong();
	long a = sca.nextLong();
	long b = sca.nextLong();
	long big1, bign, small;

	if((b-a) % 2 == 0) {
		System.out.println((b-a) / 2);
		return;
	}

	big1 = b-1;
	bign = n-a;

	if(big1 > bign){
		small = bign;
	}
	else {
		small = big1;
	}
	System.out.println(small);


	sca.close();
	}
}