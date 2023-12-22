import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		try {
			while(scan.hasNext()){
				System.out.println(scan.nextLine().toUpperCase());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}