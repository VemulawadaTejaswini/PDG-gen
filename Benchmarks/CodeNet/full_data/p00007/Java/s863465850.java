import java.util.*;
public class Main {
	public static void main(String[] args) {
		while(true){
		Scanner sc = new Scanner(System.in);
		int c = 1000;
		int n = sc.nextInt();
		int x = 5000*(n+1)+100000;
		System.out.println(Math.round((double)x / c) * c);
		}
	}		
}