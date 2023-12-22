import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;

class Color {
	int id;
	int count;
	Color(int id) {
		this.id = id;
		this.count = 1;
	}
	void add() {
		this.count++;
	}
}

class Colors {
	ArrayList<Color> cs = new ArrayList<Color>();
	Colors() {}
	void add(int ci) {
		boolean flag = true;
		for (int i=0;i<cs.size();i++) {
			if (cs.get(i).id==ci) {
				cs.get(i).add();
				flag = false;
				break;
			}
		}
		if (flag) cs.add(new Color(ci));
	}
	String search(int n) {
		for (int i=0;i<cs.size();i++) {
			if (cs.get(i).count>n/2) return Integer.toString(cs.get(i).id);
		}
		return "NO COLOR";
	}
}

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while (!(buf = br.readLine()).equals("0")) {
				int n = Integer.parseInt(buf);
				StringTokenizer st = new StringTokenizer(br.readLine());
				Colors c = new Colors();
				for (int i=0;i<n;i++) {
					c.add(Integer.parseInt(st.nextToken()));
				}
				System.out.println(c.search(n));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}