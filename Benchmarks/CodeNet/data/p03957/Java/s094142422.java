import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String moji = sc.next();

		if (  moji.indexOf('C')  > 0 &&  moji.lastIndexOf('F') > 0 && moji.indexOf('C') < moji.lastIndexOf('F')){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}


	}

}