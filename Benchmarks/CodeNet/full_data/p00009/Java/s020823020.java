import java.util.Scanner;

public class Main{
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = Integer.parseInt(scan.next());
			int m = 0;
			for(int i = 2;i<=n;i++){
				m = m + check_prime(i);
			}
			System.out.println(m);
		}
		System.exit(0);
	}
	static int check_prime(int i){
		int j = 1;
		for(int k = 2;k < i;k++){
			if(i % k == 0){
				j = 0;
				break;
			}
		}
		return j;
	}

}