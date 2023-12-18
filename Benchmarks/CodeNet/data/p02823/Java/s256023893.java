import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	long n = sca.nextLong();
	long a = sca.nextLong();
	long b = sca.nextLong();
	long biga, bigb;

	if((b-a) % 2 == 0) {
		System.out.println((b-a) / 2);
		return;
	}

	biga = a-1;
	bigb = n-b;

	if(biga < bigb) {
		a = a - biga;
		b = b - biga-1;
		System.out.println(biga + 1 + ((b-a) / 2));
	}
	else {
		b = b + bigb;
		a = a + bigb;
		System.out.println(bigb + 1 + ((b-a) / 2));
	}
	sca.close();
	}
}