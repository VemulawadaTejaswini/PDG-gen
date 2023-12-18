import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		for(int i = -100; i <= 100; i++) {
			for(int j = -100; j <= 100; j++) {
				if(Math.pow(i, 5) - Math.pow(j, 5) == X) {
					System.out.println(i + " " + j);
					return;
				}
			}
		}
	}

}
