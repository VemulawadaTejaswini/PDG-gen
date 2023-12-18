package cont;

import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	int n = input.nextInt();
	int ans = n * (n + 1) / 2;
	 
    System.out.println(ans);
	

}
}
