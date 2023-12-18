import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String yohou = scan.next();
		String tozitu = scan.next();
		int count = 0;

		for(int i=1;i<=3;i++) {
			if(yohou.substring(i,i+1).equals(tozitu.substring(i,i+1))) {
				count++;
			}
		}

		System.out.println(count);
		scan.close();

	}

}
