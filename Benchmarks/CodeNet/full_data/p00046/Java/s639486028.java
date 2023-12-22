import java.util.Scanner;


public class Main {

	public static void main(String[] args){
		Scanner type = new Scanner(System.in);
		double max =0 ; double min = 0;
		int first = 0;
		//ArrayList<Double> ls = new ArrayList<Double>();
		while(true){
			double k = type.nextDouble();
			if (k == -1) break;
			if (first == 0 ) {
				min = k;
				first++;
			}
			min = Math.min(min,k);
			max = Math.max(max, k);
		}
		//System.out.println(min +" " + max);
		System.out.println(max-min);
	}

}