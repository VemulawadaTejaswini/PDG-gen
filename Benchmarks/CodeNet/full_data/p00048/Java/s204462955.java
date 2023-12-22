import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double weight;
		while ((scan.hasNext())){
			weight = scan.nextDouble();
			System.out.println(kaikyu(weight));
		}
	}

	private static String kaikyu(double weight){
		String kaikyu = null;
		if(weight <= 48.0){
			kaikyu = "light fly";
		}else if(weight > 48.0 && 51.0 >= weight){
			kaikyu = "fly";
		}else if(weight > 51.0 && 54.0 >= weight){
			kaikyu = "bantam";
		}else if(weight > 54.0 && 57.0 >= weight){
			kaikyu = "feather";
		}else if(weight > 57.0 && 60.0 >= weight){
			kaikyu = "light";
		}else if(weight > 60.0 && 64.0 >= weight){
			kaikyu = "light welter";
		}else if(weight > 64.0 && 69.0 >= weight){
			kaikyu = "welter";
		}else if(weight > 69.0 && 75.0 >= weight){
			kaikyu = "light middle";
		}else if(weight > 75.0 && 81.0 >= weight){
			kaikyu = "middle";
		}else if(weight > 81.0 && 91.0 >= weight){
			kaikyu = "light heavy";
		}else if(91.0 < weight){
			kaikyu = "heavy";
		}

		return kaikyu;
	}
}