
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int abcde[]=new int[5];
		for(int i=0;i<abcde.length;i++) {
			abcde[i]=scan.nextInt();
		}
		int k=scan.nextInt();
		scan.close();
		int check=1;
		for(int i=0;i<abcde.length-1;i++) {
			if(k>(abcde[abcde.length-1]-abcde[i])) {
				check=0;
				System.out.println(":(");
				break;
			}
		}
		if(check==1)System.out.println("Yay!");
	}
}