
import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int distance = -1;
		int direction = -1;
		int x = 0;
		int y = 0;
		int totalDirection = 0;
		while(!(distance ==  0 && direction == 0)){
			String temp = sc.nextLine();
			String[] box = temp.split(",");
			distance = Integer.parseInt(box[0]);
			direction = Integer.parseInt(box[1]);
			totalDirection -= direction;
			if(direction > 0){
				y += Math.sin(totalDirection) * distance;
				x += Math.cos(totalDirection) * distance;
			}
		}
		System.out.println(x);
		System.out.println(y);
	}
}