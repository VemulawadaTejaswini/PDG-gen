import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int can_n = 0;
		int kaisu = 3;
		int[] num = new int[kaisu];
		for(int i = 0; i < kaisu; i++) {
			num[i] = scan.nextInt();
		}
		for(int i = num[0]; i <= num[1] ;i++) {
			if(num[2] % i == 0) can_n++;
		}
		System.out.println(can_n);

 }
}