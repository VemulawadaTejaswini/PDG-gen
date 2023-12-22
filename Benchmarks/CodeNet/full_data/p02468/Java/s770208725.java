import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int m = stdIn.nextInt();
		int n = stdIn.nextInt();
		int k = m;
		for(int i=2;i<=n;i++){
			k = k * m;
		}
		System.out.println(k);
	}

}