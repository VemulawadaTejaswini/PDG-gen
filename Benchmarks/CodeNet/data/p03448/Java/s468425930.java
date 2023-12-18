import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int x,a,b,c,z;
		z = 0;

		// 入力
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		x = scanner.nextInt();

		for(int i=0; i<=a; i++){
			for(int j=0; j<=b; j++){
				for(int k=0; k<=c; k++){
					int temp = 500*i + 100*j + 50*k;
					if(x == temp)
						z++;
				}
			}
		}

		System.out.println(z);

		scanner.close();
	}
}