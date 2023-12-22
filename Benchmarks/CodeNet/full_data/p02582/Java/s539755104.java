
public class RainySeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S[] = new String[3];
		for (String s : S) {
			int count;
			if (s.equals("SSS")) {
				count = 0;
			} else if (s.equals("RSS") || s.equals("SSR") || s.equals("RRS")) {
				count = 2;
			} else if (s.equals("RRR")) {
				count = 3;
			} else {
				count = 1;
			}

		}
	}

}
