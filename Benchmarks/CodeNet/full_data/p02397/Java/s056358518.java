
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int num;

		while(x>y){
			num = y;
			y = x;
			x = num;
			if(x == 0 && y == 0){
				break;
			}
		}
		System.out.println(x+" "+y);
	}
}