
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Pair> red = new ArrayList<>();
		List<Pair> blue = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			red.add(new Pair(sc.nextInt(), sc.nextInt()));
		}
		for(int i = 0; i < n; i++) {
			blue.add(new Pair(sc.nextInt(), sc.nextInt()));
		}
		int ans = 0;
		red.sort(Comparator.comparing(Pair::getX));
		blue.sort(Comparator.comparing(Pair::getX));
		List<Pair> redcopy = new ArrayList<>(red);
		List<Pair> bluecopy = new ArrayList<>(blue);
		int i = 0;
		int j = 0;
		int maxx = 0;
		while(i < redcopy.size()) {
			Pair redmin = redcopy.get(i);
			boolean flag = false;
			j = 0;
			while(j < bluecopy.size()) {
				Pair bluemin = bluecopy.get(j);
				if(redmin.getX() < bluemin.getX() && redmin.getY() < bluemin.getY()) {
					redcopy.remove(i);
					bluecopy.remove(j);
					flag = true;
					maxx++;
					break;
				}
				j++;
			}
			if(!flag)
				i++;
		}
		red.sort(Comparator.comparing(Pair::getY));
		blue.sort(Comparator.comparing(Pair::getY));
		i = 0;
		j = 0;
		redcopy = new ArrayList<>(red);
		bluecopy = new ArrayList<>(blue);
		int maxy = 0;
		while(i < redcopy.size()) {
			Pair redmin = redcopy.get(i);
			boolean flag = false;
			j = 0;
			while(j < bluecopy.size()) {
				Pair bluemin = bluecopy.get(j);
				if(redmin.getX() < bluemin.getX() && redmin.getY() < bluemin.getY()) {
					redcopy.remove(i);
					bluecopy.remove(j);
					flag = true;
					maxy++;
					break;
				}
				j++;
			}
			if(!flag)
				i++;
		}
		ans = Math.max(maxx, maxy);
		System.out.println(ans);
	}

}

class Pair {
	private int x;
	private int y;

	protected Pair(int x, int y) {
		super();
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

}