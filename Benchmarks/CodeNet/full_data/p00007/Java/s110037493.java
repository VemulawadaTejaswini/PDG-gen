import java.util.Scanner;

public class Main {
	public static void main(String[] a){
		long debt = 100000;
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for(int i = 0;i < n;i++){
			debt *= 1.05f;
			if(debt % 1000 != 0){
				debt = (debt/1000 + 1) * 1000;
			}
		}
		System.out.println(debt);
	}
}