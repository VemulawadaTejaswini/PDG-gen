import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int y,sum = 0,x = 1;

		while(true){
			x = sc.nextInt();
			if(x == 0){
				break;
			}
			for(int j = 1;j <= 4;j++){
				y = x % 10;
				sum = sum + y;
				x = x / 10;
			}
			System.out.println(sum);
			sum = 0;
		}
	}
}