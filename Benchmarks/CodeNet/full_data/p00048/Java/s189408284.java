import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()){
			double kg = sc.nextDouble();
			String str = "";
			if(48.00 >= kg)str = "light fly";
			else if(48.00 < kg && 51.00 >= kg)str = "fly";
			else if(51.00 < kg && 54.00 >= kg)str = "bantam";
			else if(54.00 < kg && 57.00 >= kg)str = "feather";
			else if(57.00 < kg && 60.00 >= kg)str = "light";
			else if(60.00 < kg && 64.00 >= kg)str = "light welter";
			else if(64.00 < kg && 69.00 >= kg)str = "welter";
			else if(69.00 < kg && 75.00 >= kg)str = "light middle";
			else if(75.00 < kg && 81.00 >= kg)str = "middle";
			else if(81.00 < kg && 91.00 >= kg)str = "light heavy";
			else if(91.00 < kg)str = "heavy";
			System.out.println(str);
		}
	}
}