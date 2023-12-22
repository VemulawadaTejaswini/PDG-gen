import java.awt.Point;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.Scanner;

public class A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		InputStream in = System.in;
		Scanner scanner = new Scanner(in);
		LinkedList<String> ans = new LinkedList<String>();
		while(true) {
			int num = scanner.nextInt();
			if(num == 0)
				break;
			LinkedList<Point> data = new LinkedList<Point>();
			// 0番目の四角形
			Point zero = new Point(0, 0);
			data.add(zero);
			for(int i=0; i < num - 1; i++) {
				Point cur = data.get(scanner.nextInt());
				int dir = scanner.nextInt();
				Point tmp = new Point(cur);
				switch (dir) {
				case 0:
					tmp.translate(-1, 0);
					break;
				case 1:
					tmp.translate(0, -1);
					break;
				case 2:
					tmp.translate(1, 0);
					break;
				case 3:
					tmp.translate(0, 1);
					break;
				default:
					break;
				}
				data.add(tmp);
			}
			int minX, minY, maxX, maxY;
			minX = minY = maxX = maxY = 0;
			for(Point val : data) {
				if(val.x < minX)
					minX = val.x;
				if(val.y < minY)
					minY = val.y;
				if(maxX < val.x)
					maxX = val.x;
				if(maxY < val.y)
					maxY = val.y;
			}
			int width = maxX - minX + 1;
			int height = maxY - minY + 1;
			ans.add(width + " " + height);
		}
		for(String val : ans) {
			System.out.println(val);
		}
	}

}