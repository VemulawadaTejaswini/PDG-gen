public class Main {

	public static void main(String[] args) {
			FastScanner fsc = new FastScanner();

			int Radius = fsc.nextInt();

			int  Diameter = Radius * 2;
			//Math.PIは円周率定数
			double anser = Diameter * Math.PI;
			System.out.println(anser);

	}

}
