import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		String T = in.next();
		int a = 0;
		int b = 10000;

		String[] SArray = S.split("");
		String[] TArray = T.split("");

		for(int i=0; i<SArray.length - TArray.length + 1; i++) {
			for(int j=0; j<TArray.length; j++) {
				if(!SArray[j+i].equals(TArray[j])) {
					a++;
				}
			}
			if(a < b) {
				b = a;
			}
			a = 0;
		}

		System.out.println(b);
	}
}
