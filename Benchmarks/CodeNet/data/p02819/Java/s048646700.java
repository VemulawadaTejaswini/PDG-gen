import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x= scan.nextInt();
		scan.close();
		while(true) {
			int check=1;
			for(int i=2;i<x;i++) {
				if(x%i==0)check=0;
			}
			if(check==1)break;
			x++;
		}
		System.out.println(x);
	}

}