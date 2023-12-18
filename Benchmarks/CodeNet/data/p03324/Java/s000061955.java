import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int n = sc.nextInt();
		
		int i = 1;
		if(d == 1) {
			i = 100;
		}
		else if(d == 2) {
			i = 1000;
		}
		
		System.out.println(i*n);
	}
}