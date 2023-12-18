import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int gusu=0;
		int check=0;
		
		for(int i=0;i<N;i++) {
			int A=sc.nextInt();
			if(A%2==0) {
				gusu++;
				if(A%3==0 || A%5==0) {
					check++;
				}
			}
		}
		if(check==gusu) {
			System.out.println("APPROVED");
		}
		else {
			System.out.println("DENIED");
		}
	}
}
