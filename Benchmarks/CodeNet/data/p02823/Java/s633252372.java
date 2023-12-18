import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	long n = sca.nextLong();
	long a = sca.nextLong();
	long b = sca.nextLong();
	long big1, bign, small;
	if(a > b) {
		if((a-b) % 2 == 0) {
			System.out.println(((a-b) / 2) + ((a-b) % 2));
			return;
		}
	}
	else {
		if((b-a) % 2 == 0) {
			System.out.println(((b-a) / 2) + ((b-a) % 2));
			return;
		}
	}

	if((a-1) > (b-1)) {
		big1 = a-1;
	}
	else {
		big1 = b-1;
	}
	if((n-a) > (n-b)) {
		bign = n-a;
	}
	else {
		bign = n-b;
	}
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