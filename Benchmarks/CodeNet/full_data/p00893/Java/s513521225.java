import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	class inum {
		long num;

		inum(String num) {
			// System.out.println("n |" + num);
			String fordeb = num;
			this.num = Long.valueOf(num);
		}

		long[][] eval() {
			return new long[][] { { num } };
		}
	}

	class row {
		LinkedList<expr> list = new LinkedList<expr>();

		row(String buffer) {
			// System.out.println("r |" + buffer);

			int bd = 0;
			int sd = 0;

			String e = "";
			for (int i = 0; i < buffer.length(); i++) {
				char ch = buffer.charAt(i);

				if ((sd | bd) == 0) {
					if (ch == ' ') {
						list.add(new expr(e));
						e = "";
						continue;
					}
				}
				if (ch == '(') {
					bd++;
				}
				if (ch == ')') {
					bd--;
				}
				if (ch == '[') {
					sd++;
				}
				if (ch == ']') {
					sd--;
				}
				e += ch;
			}
			if (e.length() > 0) {
				list.add(new expr(e));
			}
		}

		long[][] eval() {
			long res[][] = null;

			for (int i = 0; i < list.size(); i++) {
				res = appendYoko(res, list.get(i).eval());
			}
			return res;
		}

	}

	class rowseq {
		LinkedList<row> list = new LinkedList<row>();

		rowseq(String buffer) {
			// System.out.println("s |" + buffer);

			int bd = 0;
			int sd = 0;

			String e = "";
			for (int i = 0; i < buffer.length(); i++) {
				char ch = buffer.charAt(i);

				if ((sd | bd) == 0) {
					if (ch == ';') {
						list.add(new row(e));
						e = "";
						continue;
					}
				}
				if (ch == '(') {
					bd++;
				}
				if (ch == ')') {
					bd--;
				}
				if (ch == '[') {
					sd++;
				}
				if (ch == ']') {
					sd--;
				}
				e += ch;
			}
			if (e.length() > 0) {
				list.add(new row(e));
			}
		}

		long[][] eval() {
			long[][] res = null;
			for (int i = 0; i < list.size(); i++) {
				res = appendTate(res, list.get(i).eval());
			}
			return res;
		}

	}

	long[][] appendYoko(long[][] a, long[][] b) {
		if (a == null) {
			long[][] res = new long[b.length][b[0].length];
			for (int i = 0; i < res.length; i++) {
				for (int j = 0; j < res[0].length; j++) {
					res[i][j] = b[i][j];
				}
			}
			return res;
		}
		long[][] res = new long[a.length][a[0].length + b[0].length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				res[i][j] = a[i][j];
			}
		}
		for (int j = 0; j < res.length; j++) {
			for (int i = a[0].length; i < a[0].length + b[0].length; i++) {
				res[j][i] = b[j][i - a[0].length];
			}
		}
		return res;
	}

	long[][] appendTate(long[][] a, long[][] b) {
		if (a == null) {
			long[][] res = new long[b.length][b[0].length];
			for (int i = 0; i < res.length; i++) {
				for (int j = 0; j < res[0].length; j++) {
					res[i][j] = b[i][j];
				}
			}
			return res;
		}
		long[][] res = new long[a.length + b.length][b[0].length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				res[i][j] = a[i][j];
			}
		}
		for (int i = a.length; i < a.length + b.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				res[i][j] = b[i - a.length][j];
			}
		}
		return res;
	}

	class matrix {
		rowseq rs;

		matrix(String buffer) {
			// System.out.println("m |" + buffer);

			rs = new rowseq(buffer.substring(1, buffer.length() - 1));
		}

		long[][] eval() {
			return rs.eval();
		}
	}

	class trans {
		prim p;

		trans(String buffer) {
			// System.out.println("t |" + buffer);

			p = new prim(buffer.substring(0, buffer.length() - 1));
		}

		long[][] eval() {
			return trans(p.eval());
		}
	}

	long[][] trans(long[][] a) {
		long[][] res = new long[a[0].length][a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				res[j][i] = a[i][j];
			}
		}
		return res;
	}

	class index {
		prim p;
		expr e1;
		expr e2;

		index(String buffer) {
			// System.out.println("i |" + buffer);

			int bd = 0;
			int sd = 0;

			String e = "";

			boolean end = false;
			for (int i = 0; i < buffer.length(); i++) {
				char ch = buffer.charAt(buffer.length() - i - 1);

				if ((sd | (bd + 1)) == 0) {
					if (!end && ch == ',') {
						e2 = new expr(e.substring(0, e.length() - 1));
						e = "";
						continue;
					}
				}
				if (ch == '(') {
					bd++;
					if (!end && (sd | bd) == 0) {
						e1 = new expr(e);
						e = "";
						end = true;
						continue;
					}
				}
				if (ch == ')') {
					bd--;
				}
				if (ch == '[') {
					sd++;
				}
				if (ch == ']') {
					sd--;
				}
				e = ch + e;
			}
			p = new prim(e);
		}

		long[][] eval() {
			long[][] i = e1.eval();
			long[][] j = e2.eval();
			long[][] pe = p.eval();

			long res[][] = new long[i[0].length][j[0].length];
			for (int x = 0; x < i[0].length; x++) {
				for (int y = 0; y < j[0].length; y++) {
					res[x][y] = pe[(int) i[0][x] - 1][(int) j[0][y] - 1];
				}
			}
			return res;
		}

	}

	class prim {
		inum n;
		var v;
		matrix m;
		expr e;
		index i;
		trans t;

		char type;

		prim(String buffer) {
			// System.out.println("p |" + buffer);

			int bd = 0;
			int sd = 0;

			boolean indexed = false;
			if (buffer.endsWith(")")) {
				for (int i = 0; i < buffer.length(); i++) {
					char ch = buffer.charAt(buffer.length() - 1 - i);
					if ((sd | (bd + 1)) == 0) {
						if (ch == ',') {
							indexed = true;
							continue;
						}
					}
					if (ch == '(') {
						bd++;
					}
					if (ch == ')') {
						bd--;
					}
					if (ch == '[') {
						sd++;
					}
					if (ch == ']') {
						sd--;
					}
				}
			}
			if (indexed) {
				type = 'i';
				i = new index(buffer);
			} else if (buffer.endsWith(")")) {
				type = 'e';
				this.e = new expr(buffer.substring(1, buffer.length() - 1));
			} else if (buffer.endsWith("'")) {
				type = 't';
				t = new trans(buffer);
			} else if (buffer.endsWith("]")) {
				type = 'm';
				this.m = new matrix(buffer);

			} else if (buffer.charAt(0) - '0' < 10) {
				type = 'n';
				n = new inum(buffer);
			} else {
				type = 'v';
				v = new var(buffer);
			}
		}

		long[][] eval() {
			switch (type) {
			case 'i':
				return i.eval();
			case 'e':
				return e.eval();
			case 't':
				return t.eval();
			case 'm':
				return m.eval();
			case 'n':
				return n.eval();
			case 'v':
				return v.eval();
			}
			return null;
		}
	}

	class fact {
		int n;
		prim p;

		fact(String buffer) {
//			 System.out.println("f |" + buffer);

			n = 0;
			while (buffer.startsWith("-")) {
				n++;
				buffer = buffer.substring(1);
			}
			p = new prim(buffer);

		}

		long[][] eval() {
			long[][] res = null;
			if (n % 2 == 0) {
				return p.eval();
			}
			return sub(res, p.eval());
		}
	}

	class term {
		LinkedList<fact> list = new LinkedList<fact>();

		term(String buffer) {
//			System.out.println("t |" + buffer);

			int bd = 0;
			int sd = 0;

			String e = "";
			for (int i = 0; i < buffer.length(); i++) {
				char ch = buffer.charAt(i);

				if ((sd | bd) == 0) {
					if (ch == '*') {
						list.add(new fact(e));
						e = "";
						continue;
					}
				}
				if (ch == '(') {
					bd++;
				}
				if (ch == ')') {
					bd--;
				}
				if (ch == '[') {
					sd++;
				}
				if (ch == ']') {
					sd--;
				}
				e += ch;
			}
			if (e.length() > 0) {
				list.add(new fact(e));
			}
		}

		long[][] eval() {
			long[][] res = null;

			for (fact f : list) {
				res = mul(res, f.eval());
			}

			return res;
		}

	}

	long[][] mul(long[][] a, long[][] b) {
		if (a == null) {
			long v = 1;
			long res[][] = new long[b.length][b[0].length];
			for (int i = 0; i < res.length; i++) {
				for (int j = 0; j < res[0].length; j++) {
					res[i][j] = v * b[i][j];
				}
			}
			return res;
		}
		if (a.length == 1 && a[0].length == 1) {
			long v = a[0][0];
			long res[][] = new long[b.length][b[0].length];
			for (int i = 0; i < res.length; i++) {
				for (int j = 0; j < res[0].length; j++) {
					res[i][j] = v * b[i][j];
				}
			}
			return res;
		}

		if (b.length == 1 && b[0].length == 1) {
			long v = b[0][0];
			long res[][] = new long[a.length][a[0].length];
			for (int i = 0; i < res.length; i++) {
				for (int j = 0; j < res[0].length; j++) {
					res[i][j] = v * a[i][j];
				}
			}
			return res;
		}

		long res[][] = new long[a.length][b[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				for (int k = 0; k < a[0].length; k++) {
					res[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return res;
	}

	class expr {
		LinkedList<term> alist = new LinkedList<term>();
		LinkedList<term> slist = new LinkedList<term>();

		expr(String buffer) {
//			System.out.println("e |" + buffer);
			int bd = 0;
			int sd = 0;

			boolean A = true;
			boolean fir = true;
			String e = "";
			for (int i = 0; i < buffer.length(); i++) {
				char ch = buffer.charAt(i);
				fir = fir && ch == '-';
				if(fir){
					e+=ch;
					continue;
				}
				if ((sd | bd) == 0) {
					if(ch == '*'){
						fir= true;
						e+=ch;
						continue;
					}
					if (ch == '+') {
						if (e.length() > 0) {
							if (A) {
								alist.add(new term(e));
							} else {
								slist.add(new term(e));
							}
							fir= true;
						}
						A = true;
						e = "";
						continue;
					}
					if (ch == '-') {
						if (e.length() > 0) {
							if (A) {
								alist.add(new term(e));
							} else {
								slist.add(new term(e));
							}
							A = false;
							e = "";
							continue;
						}
						
					}
				}
				fir = false;
				if (ch == '(') {
					bd++;
				}
				if (ch == ')') {
					bd--;
				}
				if (ch == '[') {
					sd++;
				}
				if (ch == ']') {
					sd--;
				}
				e += ch;
			}
			if (e.length() != 0) {
				if (A) {
					alist.add(new term(e));
				} else {
					slist.add(new term(e));
				}
			}
		}

		long[][] eval() {
			long res[][] = null;

			for (term t : alist) {
				res = add(res, t.eval());
			}
			for (term t : slist) {
				res = sub(res, t.eval());
			}
			return res;
		}

	}

	long[][] add(long[][] a, long[][] b) {
		if (a == null) {
			a = new long[b.length][b[0].length];
		}

		long res[][] = new long[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				res[i][j] = a[i][j] + b[i][j];
			}
		}
		return res;
	}

	long[][] sub(long[][] a, long[][] b) {
		if (a == null) {
			a = new long[b.length][b[0].length];
		}

		long res[][] = new long[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				res[i][j] = a[i][j] - b[i][j];
			}
		}
		return res;
	}

	class var {
		String v;
		long[][] val;

		var(String buffer) {
			// System.out.println("v |" + buffer);
			v = buffer;
		}

		long[][] eval() {
			for (int i = 0; i < a.size(); i++) {
				if (a.get(i).v.v.equals(v)) {
					return a.get(i).v.val;
				}
			}
			return val;
		}
	}

	class as {
		var v;
		expr e;

		as(String as) {
			// System.out.println("a |" + as);
			v = new var(as.charAt(0) + "");
			e = new expr(as.substring(2, as.length() - 1));
		}

		long[][] eval() {
			v.val = e.eval();
			return v.val;
		}
	}

	LinkedList<as> a;

	void run() {
		for (;;) {
			int n = sc.nextInt();

			if (n == 0) {
				break;
			}
			a = new LinkedList<as>();
			sc.nextLine();
			for (int i = 0; i < n; i++) {
				as na = new as(sc.nextLine());
				printM(na.eval());
				a.addFirst(na);
			}
			System.out.println("-----");

		}
	}

	void printM(long[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (j != 0) {
					System.out.print(" ");
				}
				System.out.print(mat[i][j] & 0x7fff);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}