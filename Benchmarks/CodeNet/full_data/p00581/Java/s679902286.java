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

	public int GetX() {return x;}
	public int GetY() {return y;}
	public int GetO() {return orb;}
	public int GetI() {return ingot;}

	public void PlusO() { orb++; }
	public void PlusI() { ingot++; }

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
			Jewelly je;
			Jewelly[] jew;
			for (int i=0; i<h; i++) {
				s = sc.next();
				c = s.toCharArray();
				for (int j=0; j<w; j++) {
					switch(c[j]) {
					case 'J':
						je = new Jewelly(i,j);
						jewelly.add(je);
						//縦配列に記録-------------------
						if (j_h[i] == -1) {  //なにも入ってなかったら
							jList.add(new LinkedList<Jewelly>());
							j_h[i] = jList.size()-1;
						}
						jList.get(j_h[i]).add(je);

						//横配列に記録-------------------
						if (j_w[j] == -1) {  //なにも入ってなかったら
							jList.add(new LinkedList<Jewelly>());
							j_w[j] = jList.size()-1;
						}
						jList.get(j_w[j]).add(je);
						break;
					case 'O':
						if (j>0) {
							if (j_h[i] != -1) {  //その横列にJがあったら
								jew = new Jewelly[jList.get(j_h[i]).size()];
								jList.get(j_h[i]).toArray(jew);
								for (int k=0; k<jew.length; k++) {
									if (jew[k].GetY()<j) jew[k].PlusO();
									else break;
								}
							}
						}
						break;
					case 'I':
						if (i>0) {
							if (j_w[j] != -1) {  //その縦列にJがあったら
								jew = new Jewelly[jList.get(j_w[j]).size()];
								jList.get(j_w[j]).toArray(jew);
								for (int k=0; k<jew.length; k++) {
									if (jew[k].GetX()<i) jew[k].PlusI();
									else break;
								}
							}
						}
						break;
					}
				}
			}
			long sum = 0;
			jew = new Jewelly[jewelly.size()];
			jewelly.toArray(jew);
			for (int i=0; i<jew.length; i++) {
				sum += jew[i].GetI()*jew[i].GetO();
			}
			System.out.println(sum);
		}
	}
}
