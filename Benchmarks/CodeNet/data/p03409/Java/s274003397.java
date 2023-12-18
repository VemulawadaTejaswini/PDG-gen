import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		List<Pos> listRed = new ArrayList<>();
		List<Pos> listBlue = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			listRed.add(new Pos(s.nextInt(), s.nextInt()));
		}
		for (int i = 0; i < N; i++) {
			listBlue.add(new Pos(s.nextInt(), s.nextInt()));
		}
		listBlue.sort(Comparator.comparing(Pos::getX).reversed());
		
		int count = 0;
		for (Pos pos : listBlue) {
			Pos p = getMax(listRed, pos).orElse(null);
			if (p != null) {
				count++;
				listRed.remove(p);
			}
		}
		
		System.out.println(count);
	}
	
	public static Optional<Pos> getMax(List<Pos> list, Pos p){
		return list.stream()
				.filter(pos -> pos.x < p.x)
				.max(Comparator.comparing(Pos::getY));
	} 
	
	public static class Pos implements Comparable<Pos>{
		public int x;
		public int y;
		public Pos(int x, int y){
			this.x = x;
			this.y = y;
		}
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		@Override
		public int compareTo(Pos o) {
			return this.x - o.x;
		}
		@Override
		public String toString() {
			return "(" + this.x + " ," + this.y + ")";
		}
	}
}
