import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int H = sc.nextInt();
		int M = sc.nextInt();
		double HDo = H*60+M;
		HDo = HDo/(double)2;
		double MDo = M*6;
		double Sa = HDo-MDo;
		HDo = Math.PI*Sa/180;
		double C2= A*A+B*B-2*A*B*Math.cos(HDo);
		System.out.println(Math.sqrt(C2));
	}
}