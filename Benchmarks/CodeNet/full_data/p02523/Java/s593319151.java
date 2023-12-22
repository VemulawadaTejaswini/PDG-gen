import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] nn = new double[4];
		for(int i = 0; i<4; i++){
			nn[i]=sc.nextDouble();
		}
		double a = Math.sqrt(Math.pow((nn[0]-nn[2]),2)+Math.pow((nn[1]-nn[3]),2));
		System.out.println(a);
	}

}