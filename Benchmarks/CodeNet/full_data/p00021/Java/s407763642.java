import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dataset = scanner.nextInt();
		double[] input = new double[8];
		for(int i=0; i<dataset; i++){
			for(int j=0; j<8; j++){
				input[j] = scanner.nextDouble();
			}
			double tmp1 = (input[0]-input[2])/(input[1]-input[3]);
			double tmp2 = (input[4]-input[6])/(input[5]-input[7]);
			if(equal(tmp1, tmp2)){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}

	private static boolean equal(double tmp1, double tmp2) {
		if(Math.abs(tmp1-tmp2) < 0.000001){
			return true;
		}else{
			return false;
		}
	}
}