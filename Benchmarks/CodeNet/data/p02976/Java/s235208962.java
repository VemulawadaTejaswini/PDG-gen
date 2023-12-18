import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int n=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		n = sc.nextInt();
		int m = sc.nextInt();

		List<Line> lines = new ArrayList<>();
		for(int i = 0; i< m;i++){
			lines.add(new Line (sc.nextInt(), sc.nextInt()));
		}
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
		if(index == list.size()-1) {
			boolean allEven = true;
			int[] from = new int [n];
			for (Line line : list) {
				if(line.dir){
					from[line.a-1]=from[line.a-1]+1;
				} else {
					from[line.b-1]=from[line.b-1]+1;
				}
			}
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
		if(dfs(list, index+1)){
			return true;
		}
		line.setDir(false);
		return dfs(list, index+1);
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