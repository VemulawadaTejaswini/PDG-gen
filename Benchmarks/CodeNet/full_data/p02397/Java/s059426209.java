import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp, x, y;
		while(true){
			x = sc.nextInt();
			y = sc.nextInt();
			if( x == 0 ){
				break;
			}
			if(x > y){
				temp = x;
				x = y;
				y = temp;
			}
			System.out.println(x + " " + y);
		}
	}
}