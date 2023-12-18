import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		int n = Integer.parseInteger(sc.next());
		System.out.println(calculate(n));
	}
	int calculate(int n){
		if(n%2 == 0) return n/2;
		return (n/2) + 1;
	}
 
}