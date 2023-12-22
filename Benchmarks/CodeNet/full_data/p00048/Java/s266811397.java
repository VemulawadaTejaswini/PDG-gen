import java.util.ArrayList;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		while(sc.hasNextInt()){
			double kg = sc.nextDouble();
			if(48 >= kg)list.add("light fly");
			if(48 < kg && 51 >= kg)list.add("fly");
			if(51 < kg && 54 >= kg)list.add("bantam");
			if(54 < kg && 57 >= kg)list.add("feather");
			if(57 < kg && 60 >= kg)list.add("light");
			if(60 < kg && 64 >= kg)list.add("light welter");
			if(64 < kg && 69 >= kg)list.add("welter");
			if(69 < kg && 75 >= kg)list.add("light middle");
			if(75 < kg && 81 >= kg)list.add("middle");
			if(81 < kg && 91 >= kg)list.add("light heavy");
			if(91 < kg)list.add("heavy");
		}
		for(int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
	}
}