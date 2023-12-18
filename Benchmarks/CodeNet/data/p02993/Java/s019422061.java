import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] number =sc.nextLine().split(" ");
		long A = Long.parseLong(number[0]);
		long B = Long.parseLong(number[1]);
		long C = Long.parseLong(number[2]);
		long D = Long.parseLong(number[3]);
		int count = 0;
		for(int i=1;i*C*D <=B;i++) {
			count++;
		}
		for(int j=1; j*C<C*D;j++) {
			count++;
		}
		for(int k=1; k*D <C*D;k++) {
			count++;
		}
		System.out.println(B - count);

	}
}