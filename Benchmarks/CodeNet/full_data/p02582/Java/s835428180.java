public class Main {

	public static int main(String[] args) {
		// TODO Auto-generated method stub
		String S = new String();
		
		if (S.equals("SSS")) {
			return 0;
		} else if (S.equals("RSS") || S.equals("SSR") || S.equals("RRS")) {
			return 2;
		} else if (S.equals("RRR")) {
			return  3;
		} else {
			return  1;
		}
		
	}
}