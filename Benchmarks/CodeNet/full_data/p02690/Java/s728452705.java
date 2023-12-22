import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int x = sc.nextInt();
			for(int i = -150; i <= 150; i++){
				for(int j = -150; j <= 150; j++){
					int culc = (int) (Math.pow(i, 5) - Math.pow(j, 5));
					if(culc == x) {
						System.out.println(i + " " + j);
						return;
					}
				}
			}
		}
	}
}
