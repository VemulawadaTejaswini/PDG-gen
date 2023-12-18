import java.util.Scanner;

public class Main{
	static public void  main(String[] args){
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		//		long[] a = new long[n];
		long max = 0;
		for(int i = 0; i < n; i++){
			max +=  scan.nextLong();
		}
		if (max % 2 == 1) {
			System.out.println("first");
		}else{
			System.out.println("second");
		}

	}
}
