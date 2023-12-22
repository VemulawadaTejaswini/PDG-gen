import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		double max = Double.MIN_NORMAL, min = Double.MAX_VALUE;
		while(sn.hasNext()){
			double n = sn.nextDouble();
			max = Math.max(max, n);
			min = Math.min(min, n);
		}
		System.out.println(max-min);
	}
}