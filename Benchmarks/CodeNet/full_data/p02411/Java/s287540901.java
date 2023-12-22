import java.io.*;

public class Main {
	
	public enum Grade {
		A(80, -1), B(65, -1), C(50, -1), D(30, 50), F(0, -1);
		
		private int mfTotal;
		private int rTotal;
		
		Grade(int mfTotal, int rTotal) {
			this.mfTotal = mfTotal;
			this.rTotal = rTotal;
		}
		
		public String getGrade()	{ return this.name().toString();	}
		public int getMfTotal()		{ return this.mfTotal;				}
		public int getRtotal() 		{ return this.rTotal;				}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] strargs;
		String grade;
		int m, f, r, score;

		do {
			grade = "";
			strargs = br.readLine().split("\\s+");
			m = Integer.parseInt(strargs[0]);
			f = Integer.parseInt(strargs[1]);
			r = Integer.parseInt(strargs[2]);
			score = Math.addExact(m, f);
			
			for (Grade g : Grade.values()) {
				if (score >= g.getMfTotal() && r >= g.getRtotal()) {
					sb.append(g.getGrade());
					break;
				}
			}
			
			if (m == -1 && f == -1 && r == -1) break;
			sb.append("\n");
		} while(true);
		
		System.out.print(sb);
	}
}