public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int stnum;
		double weight, height, BMI;
		String data, datap[];
		while( scan.hasNext()) {
			data = scan.next();
			datap = data.split(",",3);
			stnum = Integer.valueOf(datap[0]);
			weight = Double.valueOf(datap[1]);
			height = Double.valueOf(datap[2]);
			BMI = (weight)/(height*height);
			if(BMI>=25.0) System.out.println(stnum);
		}
	}

}