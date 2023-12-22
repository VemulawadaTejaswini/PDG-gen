public class Main{

	public static void main(String[] args) {
		int line;
		double mass;
		try {
			line = Integer.parseInt(args[0]);
			if (line >= 1 & line <= 100){
				mass = Math.pow((double)line, (double)3);
				System.out.println((int) mass);
			}
		}catch(Exception e) {
			System.out.println("Exception:" + e);
		}
	}

}

