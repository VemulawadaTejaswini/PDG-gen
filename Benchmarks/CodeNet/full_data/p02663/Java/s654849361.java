import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		//input integer
		int H1 = sc.nextInt();
		//input integer divided by a space
		int M1 = sc.nextInt();
		int H2 = sc.nextInt();
		int M2 = sc.nextInt();
		int K = sc.nextInt();
		int totalAwake = (H2-H1)*60+(M2-M1);
		int study = totalAwake - K;
		//output
		System.out.println(study);
		sc.close();
	}

}
