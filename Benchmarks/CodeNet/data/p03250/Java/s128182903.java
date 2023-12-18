import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] aa=new int[3];

		for(int i=0; i<3; i++) {
			aa[i]=sc.nextInt();
		}
		Arrays.sort(aa);

		System.out.println(aa[2]*10+aa[1]+aa[0]);
	}
}