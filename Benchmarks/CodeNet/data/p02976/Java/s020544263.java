package atc0714a;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int n;
	static int[] from;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		n = sc.nextInt();

		int m = sc.nextInt();

		List<Line> lines = new ArrayList<>();
		for(int i = 0; i< m;i++){
			lines.add(new Line (sc.nextInt(), sc.nextInt()));
		}

		from = new int [n];

		boolean result = dfs(lines, 0);
		if(!result){
			System.out.println("-1");
		} else {
			for (Line line : lines) {
				System.out.println(line);
			}
		}

	}

	private static boolean dfs(List<Line> list, int index){
		if(index == list.size()) {
			boolean allEven = true;
			for (int i : from) {
				if(i%2!=0){
					allEven = false;
					break;
				}
			}
			return allEven;
		}
		Line line = list.get(index);
		line.setDir(true);
		from[line.a-1]=from[line.a-1]+1;
		if(dfs(list, index+1)){
			return true;
		}
		from[line.a-1]=from[line.a-1]-1;
		line.setDir(false);
		from[line.b-1]=from[line.b-1]+1;
		if( dfs(list, index+1)){
			return true;
		}
		from[line.b-1]=from[line.b-1]-1;
		return false;
	}

	private static class Line{ // true >       false <
		private int a = 0;
		private int b = 0;
		private boolean dir = false;
		Line(int a, int b){
			this.a = a;
			this.b = b;
		}

		void setDir(boolean dir){
			this.dir = dir;
		}

		@Override
		public String toString(){
			if(dir){
				return a + " " + b;
			}
			return b + " " + a;
		}
	}



}



