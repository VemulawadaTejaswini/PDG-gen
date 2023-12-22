import java.util.*;

public class Main{
	public static void main(String[] args){

		List<Double> listAl = new ArrayList<Double>();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while(n != 0){
			int[] soc = new int[n];
			int sum = 0;
			for(int i = 0; i < n; i++){
				int s = scan.nextInt();
				soc[i] = s;
				sum += s;
			}
			double m = (double) sum / (double) n;
			double a = 0.0;
			for(int i = 0; i < n; i++){
				a += Math.pow((double) soc[i] - m, 2);
			}
			double al = Math.sqrt(a / n);
			listAl.add(al);
		}

		for(double a : listAl){
			System.out.println(a);
		}
	}
}