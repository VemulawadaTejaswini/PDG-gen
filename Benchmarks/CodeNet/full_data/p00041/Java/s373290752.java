import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		for (String str; ! (str = br.readLine()).equals("0 0 0 0"); ) {
			String[] data = str.split(" ");
			String ans = solve(data[0], data[1], data[2], data[3]);
			System.out.println(ans);
		}
	}

	public static String solve(String a, String b, String c, String d) {
		LinkedList<Term> a_b_c_d = new LinkedList<>();
		a_b_c_d.add(new Term(a));
		a_b_c_d.add(new Term(b));
		a_b_c_d.add(new Term(c));
		a_b_c_d.add(new Term(d));

		HashSet< LinkedList<Term> > before = new HashSet<>();
		HashSet< LinkedList<Term> > after = new HashSet<>();

		before.add(a_b_c_d);
		for (int i=0; i < 3; i++) {
			for( LinkedList<Term> e : before) {
				LinkedList<Term> copy = new LinkedList<>(e);
				HashSet< LinkedList<Term> > temp = calc(copy);
				after.addAll(new HashSet<LinkedList<Term>>(temp));
			}
			before = after;
			after = new HashSet<>();
		}

		for (LinkedList<Term> e : before) {
			if (e.getFirst().num == 10) {
				return e.getFirst().expression;
			}
		}
		return "0";
	}

	/*
	 * ????????????????????????????????????????????????????????????
	 * ????????????????????§ +, *, - ???????????\?????°????????????
	 * ????????????????????????????????£???????????????????????\???????????\?????°???????????????
	 * ??????????????????????????¨????????????????????????????????¨???????????????????????§?????\?????¶?????????
	 * ??°??????????????????????????°??????????????????????????????
	 */
	public static HashSet< LinkedList<Term> > calc(LinkedList<Term> termlist) {
		HashSet< LinkedList<Term> > ret = new HashSet<>();
		for (int i=0; i < termlist.size(); i++) {
			for (int j=i+1; j < termlist.size(); j++) {
				LinkedList<Term> templist = new LinkedList<>();
				for (int k=0; k < termlist.size(); k++) {
					if (k != i && k != j) {
						templist.add(new Term(termlist.get(k)));
					}
				}

				Term temp = termlist.get(i).plus( termlist.get(j) );
				LinkedList<Term> list_i_plus_j = new LinkedList<>(templist);
				list_i_plus_j.add(temp);
				ret.add(list_i_plus_j);

				temp = termlist.get(i).multiple( termlist.get(j) );
				LinkedList<Term> list_i_multiple_j = new LinkedList<>(templist);
				list_i_multiple_j.add(temp);
				ret.add(list_i_multiple_j);

				temp = termlist.get(i).minus( termlist.get(j) );
				LinkedList<Term> list_i_minus_j = new LinkedList<>(templist);
				list_i_minus_j.add(temp);
				ret.add(list_i_minus_j);

				if (  termlist.get(i).num == termlist.get(j).num  ) continue;

				temp = termlist.get(j).minus( termlist.get(i) );
				LinkedList<Term> list_j_minus_i = new LinkedList<>(templist);
				list_j_minus_i.add(temp);
				ret.add(list_j_minus_i);
			}
		}
		return ret;
	}

	public static class Term {
		public int num;
		public String expression;

		public Term(String num) {
			this.num = Integer.parseInt(num);
			this.expression = num;
		}

		private Term(int num, String expression) {
			this.num = num;
			this.expression = expression;
		}

		public Term(Term t) {
			this.num = t.num;
			this.expression = t.expression;
		}

		public Term plus(Term t) {
			int retnum;
			retnum = this.num + t.num;
			String retstr;
			retstr = "(" + this.expression + " + " + t.expression + ")";
			return new Term(retnum, retstr);
		}

		public Term minus(Term t) {
			int retnum;
			retnum = this.num - t.num;
			String retstr;
			retstr = "(" + this.expression + " - " + t.expression + ")";
			return new Term(retnum, retstr);
		}

		public Term multiple(Term t) {
			int retnum;
			retnum = this.num * t.num;
			String retstr;
			retstr = "(" + this.expression + " * " + t.expression + ")";
			return new Term(retnum, retstr);
		}

		public boolean equals(Term t) {
			if (this.num == t.num) return true;
			else return false;
		}
//		@Override
//		public int hashCode() {
//			final int prime = 31;
//			int result = 1;
//			result = prime * result + num;
//			return result;
//		}
//
//		@Override
//		public boolean equals(Object obj) {
//			if (this == obj)
//				return true;
//			if (obj == null)
//				return false;
//			if (getClass() != obj.getClass())
//				return false;
//			Term other = (Term) obj;
//			if (num != other.num)
//				return false;
//			return true;
//		}
	}
}