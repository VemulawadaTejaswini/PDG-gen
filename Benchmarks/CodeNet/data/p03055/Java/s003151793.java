//package nishiki_quest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		String[] input;
		ArrayList<Point> points = new ArrayList<Point>();

		input = br.readLine().split(" ");
		points.add(new Point(Integer.parseInt(input[0])));
		points.add(new Point(Integer.parseInt(input[1])));
		points.get(0).connect(points.get(1));
		points.get(1).connect(points.get(0));
		//sideにindex0を追加するコードがここ
		//以下forで辺情報を読み込み、Pointに格納
		for(int i=1;i<N;i++) {
			input = br.readLine().split(" ");
			int[] side = {Integer.parseInt(input[0]),Integer.parseInt(input[1])};
			for(int j=1;j<=i;j++) {
				Point target = points.get(j);
				if(side[0]==target.no) {
					Point newPoint = new Point(side[1]);
					points.add(newPoint);
					target.connect(newPoint);
					newPoint.connect(target);
					break;
				}else if(side[1]==target.no) {
					Point newPoint = new Point(side[0]);
					points.add(newPoint);
					target.connect(newPoint);
					newPoint.connect(target);
					break;
				}
			}
		}

		PointsMng tree = new PointsMng(points);

		if(tree.calcFar()%3==2)
			System.out.println("Second");
		else
			System.out.println("First");

	}

}

class Point{
	int no;
	int lengthToFar;
	ArrayList<Point> next;

	Point(int no){
		this.no = no;
	}

	void connect(Point next) {
		this.next.add(next);
	}

	int calcMaxLength(Point back){
		int max =0;
		for(Point nextPoint:next) {
			if(nextPoint != back) {
				int length = nextPoint.calcMaxLength(this)+1;
				if(max < length) max=length;
			}
		}
		return max;
	}
}

class PointsMng{

	ArrayList<Point> tree;
	ArrayList<Point> ends;
	PointsMng(ArrayList<Point> tree){
		this.tree = tree;
		for(Point point:tree) {
			if(point.next.size()==1) ends.add(point);
		}
	}

	int calcFar(){
		int max = 0;
		for(Point end:ends) {
			if(max < (end.lengthToFar = end.calcMaxLength(null))) {
				max = end.lengthToFar;
			}
		}
		return max;
	}
}
