import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());
		long m = (long)Math.pow(10,9)+7;

		ArrayList<Integer> aArrayList = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			aArrayList.add(Integer.parseInt(sc.next()));
		}

		if (n % 2 == 0){
			for (int i=1; i<=n/2; i++){
				int I = i;
				if (aArrayList.stream().filter(o -> o == 2*I-1).count() != 2){
					System.out.println(0);
					return;
				}
			}
			System.out.println((long)Math.pow(2,n/2)%m);
		}
		else {
			if (aArrayList.stream().filter(o -> o == 0).count() != 1){
				System.out.println(0);
				return;
			}

			for (int i=1; i<=(n-1)/2; i++){
				int I = i;
				if (aArrayList.stream().filter(o -> o == 2*I).count() != 2){
					System.out.println(0);
					return;
				}
			}
			System.out.println((long)Math.pow(2,(n-1)/2)%m);
		}
	}
}
