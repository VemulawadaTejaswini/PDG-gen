public class Main {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		while(in.hasNext()) {
			Double weight = in.nextDouble();
			if(weight <= 48) System.out.println("light fly");
			else if(48 < weight && weight <= 51) System.out.println("fly");
			else if(51 < weight && weight <= 54) System.out.println("bantam");
			else if(54 < weight && weight <= 57) System.out.println("feather");
			else if(57 < weight && weight <= 60) System.out.println("light");
			else if(60 < weight && weight <= 64) System.out.println("light welter");
			else if(64 < weight && weight <= 69) System.out.println("welter");
			else if(69 < weight && weight <= 75) System.out.println("light middle");
			else if(75 < weight && weight <= 81) System.out.println("middle");
			else if(81 < weight && weight <= 91) System.out.println("light heavy");
			else if(91 < weight) System.out.println("heavy");
		}
	}
}