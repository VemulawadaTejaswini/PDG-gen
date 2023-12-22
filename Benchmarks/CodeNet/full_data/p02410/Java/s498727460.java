import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while ((s = stdIn.readLine()) != null) {
			String[] ss = s.split(" ");
			int vn = Integer.valueOf(ss[0]);
			int vm = Integer.valueOf(ss[1]);

			Vect vect1 = new Vect();
			for (int i = 0; i < vn; i++)
				vect1.addRow(stdIn.readLine());

			Vect vect2 = new Vect();
			for (int i = 0; i < vm; i++)
				vect2.addRow(stdIn.readLine());

			Vect vect3 = new Vect();
			vect3.multi(vect1, vect2);
		}
		System.exit(0);
	}
}

class Vect {
	List<Vrow> rows = new ArrayList<Vrow>();

	public void addRow(String row) {
		Vrow r = new Vrow(row);
		rows.add(r);
	}

	public void multi(Vect vect1, Vect vect2) {
		for (int r = 0; r < vect1.getRcount(); r++) {
			for (int c = 0; c < vect2.getCcount(); c++) {
				int e = 0;
				for (int i = 0; i < vect2.getRcount(); i++)
					e += (vect1.getElem(r, i) * vect2.getElem(i, c));
				if (c > 0)
					System.out.print(" ");
				System.out.print(e);
			}
			System.out.println("");
		}
	}

	private int getRcount() {
		return rows.size();
	}

	private int getCcount() {
		return rows.get(0).getCcount();
	}

	public int getElem(int r, int c) {
		return rows.get(r).get(c);

	}
}

class Vrow {
	List<Integer> elem = new ArrayList<Integer>();

	public Vrow(String row) {
		String[] rows = row.split(" ");
		for (int i = 0; i < rows.length; i++)
			elem.add(Integer.valueOf(rows[i]));
	}

	public int getCcount() {
		return elem.size();
	}

	public int get(int c) {
		return elem.get(c);
	}
}