import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static String[] Array = new String[3];
	static String line;
	static int number;
	static double height, weight;
	 
	public static void main(String[] args) {
		while(read()){
			slove();
		}
	}

	static boolean read(){
		if(!sc.hasNext()){
			return false;
		}else{
			line = sc.nextLine();
			Array = line.split(",");
			number = Integer.parseInt(Array[0]);
			weight = Double.parseDouble(Array[1]);
			height = Double.parseDouble(Array[2]);
			return true;
		}
	}
	
	static void slove(){
		double BMI = 0.0;
	//	System.out.println(number);
		//System.out.println(weight);
		//System.out.println(height);
		BMI = weight/(height*height);
		if(BMI >= 25.0){
			System.out.println(number);
		}
		
	}
}