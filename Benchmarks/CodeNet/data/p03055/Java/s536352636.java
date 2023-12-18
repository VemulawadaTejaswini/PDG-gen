//package nishiki_quest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc =  new Scanner(System.in);
		int N = sc.nextInt();

		ArrayList<Point> points = new ArrayList<Point>();

		points.add(new Point(sc.nextInt()));
		points.add(new Point(sc.nextInt()));
		points.get(0).connect(points.get(1));
		points.get(1).connect(points.get(0));
		//sideにindex0を追加するコードがここ
		//以下forで辺情報を読み込み、Pointに格納
		for(int i=1;i<N-1;i++) {
			int[] side = {sc.nextInt(),sc.nextInt()};
			for(int j=0;j<=i;j++) {
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

		sc.close();
		PointsMng tree = new PointsMng(points);
		int max = tree.calcFar()+1;
		/*
		for(Point p:tree.ends)
			System.out.println(p.no+"\t"+p.lengthToFar);
			*/
		if(max%3==2)
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
		next = new ArrayList<Point>();
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
	ArrayList<Point> ends = new ArrayList<Point>();
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
