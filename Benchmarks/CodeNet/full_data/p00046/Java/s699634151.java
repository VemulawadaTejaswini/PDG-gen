import java.util.Scanner;


public class Main {

	public static void main(String[] args){
		Scanner type = new Scanner(System.in);
		double max =0 ; double min = 0;
		//ArrayList<Double> ls = new ArrayList<Double>();
		while(type.hasNext()){
			double k = type.nextDouble();
			min = Math.min(min, k);
			max = Math.max(max, k);
		}
		System.out.println(max-min);
	}

}