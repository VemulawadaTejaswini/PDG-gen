import java.util.*;

public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			double [][] data = new double[n][3];
			for(int i = 0; i < n; i++){
				for(int j = 0; j < 3; j++){
					data[i][j] = sc.nextDouble();
				}
			}
			double totalmax = 0;
			for(int i = 0; i < (1 << n); i++){
				ArrayList<Integer> list = new ArrayList<Integer>();
				for(int j = 0; j < n; j++){
					if((i & (1 << j)) == 0) continue;
					list.add(j);
				}
				if(list.size() != m) continue;
				double sum = 0;
				for(int j = 0; j < list.size(); j++){
					for(int k = j + 1; k < list.size(); k++){
						int indj = list.get(j);
						int indk = list.get(k);
						double a = data[indj][0] - data[indk][0];
						double b = data[indj][1] - data[indk][1];
						double c = data[indj][2] - data[indk][2];
						double sumsq = a * a + b * b + c * c;
						sum += sumsq;
					}
				}
				totalmax = Math.max(totalmax, sum);
			}

			System.out.printf("%.8f\n",totalmax);
		}
	}
	
	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}