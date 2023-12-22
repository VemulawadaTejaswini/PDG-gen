package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i,tmp;
		double x=0, y=0;
		List<Integer> list = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		//list.add(Integer.parseInt(scanner.next()));
		for(i=0; i<6; i++) {
			list.add(scanner.nextInt());
		}
		tmp = list.get(0);
		for(i=0; i<3; i++) {
			list.set(i, list.get(i)*list.get(3));
			list.set(i+3, list.get(i+3)*tmp);
		}
		list.add(list.get(1)-list.get(4));
		list.add(list.get(2)-list.get(5));
		y = list.get(7)/list.get(6);
		x = (list.get(2)-list.get(1)*y)/list.get(0);
		//System.out.println(list);
		System.out.println(String.format("%.3f", x) + " " + String.format("%.3f", y) );
		scanner.close();
	}
}
