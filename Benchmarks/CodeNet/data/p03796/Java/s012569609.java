import java.util.Scanner;

public class Main {

	public static void main(String args[]){

		Scanner cin = new Scanner(System.in);
		long target = cin.nextLong();
		long tmp = 1L;

		for(long i=0L;i<target;i++){
			tmp *=i;
			tmp %= (Math.pow(10, 9)+7);
		}

		System.out.println(tmp);
	}
}
