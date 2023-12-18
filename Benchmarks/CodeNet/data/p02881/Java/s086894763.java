import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long seisu = scan.nextLong();
		long syou = 0;
		long a = 0,b = 0;
		long re = Long.MAX_VALUE;

		for(int i=1;i<=Math.sqrt(seisu);i++) {

			if(seisu%i==0) {
				a = i;
			b = seisu/i;
			}
		re = Math.min(re,a+b-2);
		}
		System.out.println(re);
		scan.close();

	}

}
