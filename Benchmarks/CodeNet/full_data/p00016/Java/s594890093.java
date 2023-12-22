import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Position currentPosition = new Position();
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(",");

		//入力値をもとに移動する
		while(true){
			int distance = sc.nextInt();
			int angle = sc.nextInt();
			if(distance == 0 && angle == 0)	break;
			currentPosition.move(distance, angle);
		}
		
		System.out.println(currentPosition);
		
		sc.close();
	}
}

class Position{
	private double x;
	private double y;
	private int currentAngle;
	public Position() {
		x = 0.0;
		y = 0.0;
		currentAngle = 90;
	}
	public void move(int distance, int angle){
		x += distance * Math.cos(Math.toRadians(currentAngle));
		y += distance * Math.sin(Math.toRadians(currentAngle));
		currentAngle -= angle;
	}
	@Override
	public String toString(){
		return (int)x + "\n" + (int)y;
	}
}