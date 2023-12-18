import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		char workLine[] = sc.nextLine().toCharArray();
		int squares[] = new int[workLine.length];

		for(int j = 0;j < workLine.length; j++) {
			int moveCnt = 0;

			char startDirection = workLine[j];
			int directionPoint = startDirection == 'R' ? 1 : -1;
			int currentPoint = j;

			while(true) {
				currentPoint += directionPoint;
				moveCnt++;

				if(!(workLine[currentPoint] == startDirection)) {
					break;
				}
			}

			currentPoint = (moveCnt % 2 == 1) ?
				currentPoint + (directionPoint * -1) : currentPoint;
			squares[currentPoint]++;
		}

		StringBuffer sb = new StringBuffer();
		for(int x : squares) {
			sb.append(x).append(" ");
		}
		sb.setLength(sb.length()-1);

		System.out.println(sb.toString());
	}
}
