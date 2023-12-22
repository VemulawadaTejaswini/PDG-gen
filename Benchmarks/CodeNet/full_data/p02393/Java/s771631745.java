import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int[] ary = new int[3];
			for(int i=0; i< ary.length ; i++) {
				ary[i]= sc.nextInt();
				if(ary[i] < 1 || ary[i] > 10000){
					System.exit(0);
				}
			}
			Arrays.sort(ary);
			System.out.println(String.format("%d %d %d", ary[0],ary[1],ary[2]));
		}
	}
}