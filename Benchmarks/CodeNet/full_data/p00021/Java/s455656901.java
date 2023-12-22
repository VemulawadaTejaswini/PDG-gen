import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Double> points = new ArrayList<Double>();
		int length = Integer.parseInt(input.nextLine());
		for(int i = 0;i < length;i++){
			points = line();
			boolean judge = hantei(points);
			if(judge == true){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}

	}

	public static ArrayList<Double> line(){
		Scanner input = new Scanner(System.in);
		ArrayList<Double> points = new ArrayList<Double>();
		for(int i = 0;i < 8;i++){
			points.add(Double.parseDouble(input.next()));
		}
		return points;
	}

	public static boolean hantei(ArrayList<Double> points){
		boolean judge = false;
		if(points.get(1).equals(points.get(5)) && points.get(3).equals(points.get(7))){

			judge = true;

		}else if(points.get(0).equals(points.get(4)) && points.get(2).equals(points.get(6))){

			judge = true;

		}

		return judge;
	}

}