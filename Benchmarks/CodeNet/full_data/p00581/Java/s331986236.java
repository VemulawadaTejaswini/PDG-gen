import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Jewelly {
	private int x;
	private int y;
	private int orb;  //自分より右のOの数
	private int ingot;  //自分より下のIの数

	public Jewelly(int xx,int yy){
		x = xx;
		y = yy;
		orb = 0;
		ingot = 0;
	}

	public int getX() {return x;}
	public int getY() {return y;}
	public int getO() {return orb;}
	public int getI() {return ingot;}

	public void plusO() { orb++; }
	public void plusI() { ingot++; }
	
	public void update(int xx, int yy,int type) {
		if (type == 0) {
			if ((xx==x)&&(y<yy)) orb++;
		} else if (type == 1) {
			if ((yy==y)&&(x<xx)) ingot++;
		}		
	}
}

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			List<List<Jewelly>> jList = new LinkedList<List<Jewelly>>();
			List<Jewelly> jewelly = new LinkedList<Jewelly>();
			int[] j_h = new int[h];
			int[] j_w = new int[w];
			for (int i=0; i<h; i++) j_h[i] = -1;
			for (int i=0; i<w; i++) j_w[i] = -1;
			
			String s;
			char[] c;
			for (int i=0; i<h; i++) {
				s = sc.next();
				c = s.toCharArray();
				for (int j=0; j<w; j++) {
					if (c[j] == 'J') {
						Jewelly je = new Jewelly(i,j);
						jewelly.add(je);
					} else {
						Jewelly[] jew = new Jewelly[jewelly.size()];
						jewelly.toArray(jew);
						for (int k=0; k<jew.length; k++) {
							if (c[j] == 'O')jew[k].update(i, j, 0);
							else jew[k].update(i, j, 1);
						}
					}
				}
			}
			long sum = 0;
			for (Jewelly jew : jewelly) {
				sum += jew.getI()*jew.getO();
			}
			System.out.println(sum);
		}
	}
}

