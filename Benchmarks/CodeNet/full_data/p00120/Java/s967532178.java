import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(sc.hasNextDouble()){
			String[] s = sc.nextLine().split(" ");
			double len = Double.parseDouble(s[0]);
			LinkedList<Double> rlist = new LinkedList<Double>();

			for(int i=1;i<s.length;i++){
				rlist.add(Double.parseDouble(s[i]));
			}

			System.out.println(isCorrect(len,rlist) ? "OK" : "NA");
		}
	}

	private static boolean isCorrect(double len,LinkedList<Double> rlist){
		double[] r = new double[rlist.size()];
		for(int i=0;!rlist.isEmpty();i++){
			r[i] = i % 2 == 0 ? rlist.removeFirst() : rlist.removeLast();
		}

		int n = r.length;
		double sum = r[0] + r[n-1];

		for(int i=1;i<n;i++){
			double rr = Math.pow(r[i-1] + r[i], 2);
			double y = Math.pow(r[i-1] - r[i], 2);
			sum += Math.sqrt(rr - y);
		}

		return sum > len ? false : true;
	}
}