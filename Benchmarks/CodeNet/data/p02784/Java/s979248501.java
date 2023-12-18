import java.util.*;

/**
 * @author yamato
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int H = scanner.nextInt();
		int N = scanner.nextInt();
		int i;
		int sum = 0;
		for(i=0;i<N;i++) {
			sum += scanner.nextInt();;
		}
		if(H>sum) {
			System.out.print("No");
		}else {
			System.out.print("Yes");
		}
		
		
		
	}

}

