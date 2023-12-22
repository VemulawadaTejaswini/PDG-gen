import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		for(int i = 0; i < num; i++){
			int x = i + 1;
			if(x % 3 == 0){
				System.out.print(" " + (i + 1));
				continue;
			}
			while(x > 0){
				if(x % 10 == 3){
					System.out.print(" " + (i + 1));
					break;
				}
				x /= 10;
			}
		}
		System.out.println();
	}
}