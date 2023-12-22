import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while (true) {
			int w = sc.nextInt();
			int h = sc.nextInt();

			if(w==0&&h==0)break;
			// boolean[][] map=new boolean[h][w];
			// boolean[][] flag=new boolean[h][w];
			Masu[][] map = new Masu[h][w];

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++)
					map[i][j] = new Masu(sc.nextInt() == 1 ? true : false, j, i);
			}

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (i + 1 < h && map[i + 1][j].flag)
						map[i][j].list.add(map[i + 1][j]);
					if (j + 1 < w && map[i][j + 1].flag)
						map[i][j].list.add(map[i][j + 1]);
					if (i - 1 >= 0 && map[i - 1][j].flag)
						map[i][j].list.add(map[i - 1][j]);
					if (j - 1 >= 0 && map[i][j - 1].flag)
						map[i][j].list.add(map[i][j - 1]);
					if (i + 1 < h && j + 1 < w && map[i + 1][j + 1].flag)
						map[i][j].list.add(map[i + 1][j + 1]);
					if (i - 1 >= 0 && j - 1 >= 0 && map[i - 1][j - 1].flag)
						map[i][j].list.add(map[i - 1][j - 1]);
					if (i + 1 < h && j - 1 >= 0 && map[i + 1][j - 1].flag)
						map[i][j].list.add(map[i + 1][j - 1]);
					if (i - 1 >= 0 && j + 1 < w && map[i - 1][j + 1].flag)
						map[i][j].list.add(map[i - 1][j + 1]);
				}
			}

			int count = 0;

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (map[i][j].flag && !map[i][j].sw){
						map[i][j].search();
						count++;
					}
				}
			}

			System.out.println(count);
		}
	}

}

class Masu {
	boolean flag;
	int ww;
	int hh;
	boolean sw;
	ArrayList<Masu> list = new ArrayList<Masu>();

	public Masu(boolean flag, int ww, int hh) {
		this.flag = flag;
		this.ww = ww;
		this.hh = hh;
		this.sw = false;

	}

	public void search() {
		sw = true;
		while (true) {
			if (list.isEmpty())
				return;
			Masu sub = list.remove(0);
			if (!sub.sw)
				sub.search();
		}

	}

}