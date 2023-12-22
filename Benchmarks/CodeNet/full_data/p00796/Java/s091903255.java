import java.util.*;
public class Main {
	double EPS = 1.0e-02;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- > 0){
			double [] compDis = new double[3];
			for(int i = 0; i < 3; i++){
				compDis[i] = sc.nextDouble();
			}
			int m = sc.nextInt();
			double [][] inputDis = new double[m][3];
			for(int i = 0; i < m; i++){
				for(int j = 0; j < 3; j++){
					inputDis[i][j] = sc.nextDouble();
				}
			}
			
			calc(compDis, inputDis);
			
		}
	}
	
	private void calc(double [] compDis, double [][] inputDis){
		int m = inputDis.length;
		for(int i = 0 ; i < m; i++){
			for(int j = 0; j < m; j++){
				for(int k = 0; k < m; k++){
					if(i == j || i == k || j == k) continue;
					double a = getDis(inputDis[i], inputDis[j]);
					double b = getDis(inputDis[j], inputDis[k]);
					double c = getDis(inputDis[k], inputDis[i]);
					double rate = compDis[0] / a;
					double value1 = rate * b;
					double value2 = rate * c;
					//System.out.println(isSimilar(compDis[1],value1) +" "+ isSimilar(compDis[2], value2));
					if(isSimilar(compDis[1],value1) && isSimilar(compDis[2], value2)){
						System.out.println((k+1) + " "+ (i+1) + " " + (j+1));
						return;
					}
				}
			}
		}
	}
	
	

	private boolean isSimilar(double comp, double value1) {
		if(value1 - EPS <= comp && comp <= value1 + EPS){
			return true;
		}
		return false;
	}

	private double getDis(double [] a, double [] b) {
		double x = a[0] - b[0];
		double y = a[1] - b[1];
		double z = a[2] - b[2];
		double res = x * x + y * y + z * z;
		return Math.sqrt(res);
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}