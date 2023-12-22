import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		while(scan.hasNext()){
			int x=scan.nextInt();
			int y=scan.nextInt();
			if(x==0 && y==0)
				break;
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {
					System.out.print("#");
				}
				//if(i<x-1)
				System.out.println();
			}
			System.out.println();
		}
	}

}