import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());
		long m=(int)Math.pow(10,9)+7;
		String sString = sc.nextLine();

		if (n%2 == 0){
			for (int i=0; i<n/2; i++){
				int num = 2*i+1;
				long count = sString.chars().filter(ch -> ch == Character.forDigit(num, 10)).count();
				if (count != 2){
					System.out.println(0);
					return;
				}
			}
			System.out.println((long)Math.pow(2, n/2)%m);
			return;
		}else {
			long count = sString.chars().filter(ch -> ch == '0').count();
			if (count != 1){
				System.out.println(0);
				return;
			}
			for (int i=1; i<n/2; i++){
				int num = 2*i;
				long count2 = sString.chars().filter(ch -> ch == Character.forDigit(num, 10)).count();
				if (count2 != 2){
					System.out.println(0);
					return;
				}
			}
			System.out.println((long)Math.pow(2, (n-1)/2)%m);
			return;
		}
	}
}
