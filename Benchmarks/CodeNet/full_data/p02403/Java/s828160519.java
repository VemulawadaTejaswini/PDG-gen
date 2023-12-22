import java.util.*;
public class Main {

	public static void main(String[] args) {
		int i1, i2;
		Scanner sc = new Scanner(System.in);
		i1 = sc.nextInt();
		i2 = sc.nextInt();
		for(int i = 0; i < i1; i++){
			System.out.println("");
			for(int j = 0; j < i2; j++)
				System.out.print("#");
		}
		System.out.println("");
	}
	}