import java.util.Scanner;

public class Main {
	public static void main(String args[]) {


		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());

		int count = 0;
		int res = 0;

		for(int i=0 ; i<a+1 ; i++) {
			for(int j=0 ; j<b+1 ; j++){
				for(int k=0 ; k<c+1 ; k++){
					res = 500*a+100*b+50*c;
					if(res == x) {
						count++;
					}
				}
			}

		}

		System.out.println(count);

	}
}
