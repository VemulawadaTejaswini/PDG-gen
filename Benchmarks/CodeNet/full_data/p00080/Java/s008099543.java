import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int write = 0;
		while(true){
			write = sc.nextInt();
			if(write == -1) break;
			System.out.println(Math.cbrt(write));
		}
		sc.close();
	}	

}