import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int f = in.nextInt();
		int r = in.nextInt();
		while(m != -1 || f != -1 || r != -1){
			if(m == -1 || f == -1){
				System.out.println("F");
			}
			else if(m + f >= 80){
				System.out.println("A");
			}
			else if(m + f >= 65){
				System.out.println("B");
			}
			else if(m + f >= 50){
				System.out.println("C");
			}
			else if(m + f >= 30){
				if(r >= 50){
					System.out.println("C");
				}
				else{
					System.out.println("D");
				}
			}
			else if(m + f < 30){
				System.out.println("F");
			}
			m = in.nextInt();
			f = in.nextInt();
			r = in.nextInt();
		}
	}

}