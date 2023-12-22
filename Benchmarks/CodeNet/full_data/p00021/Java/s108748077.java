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
			double vec1x = input[2] - input[0];
			double vec1y = input[3] - input[1];
			double vec2x = input[6] - input[4];
			double vec2y = input[7] - input[5];
			if( Math.abs((vec1x*vec2y)-(vec1y*vec2x)) < 1e-9 ){
				if(Math.abs(vec1x) < 1e-9 || Math.abs(vec2x) < 1e-9){
					if(Math.abs(input[0] - input[4]) < 1e-9){
						System.out.println("NO");
					}else{
						System.out.println("YES");
					}
				}else if(Math.abs(vec1y) < 1e-9 || Math.abs(vec2y) < 1e-9){
					if(Math.abs(input[1] - input[5]) < 1e-9){
						System.out.println("NO");
					}else{
						System.out.println("YES");
					}
				}
				else if(Math.abs(input[4] - ((vec1y/vec1x)*(input[5]-input[0])+input[1])) < 1e-9){
					System.out.println("NO");
				}
				else{
					System.out.println("YES");
				}
			}else{
				System.out.println("NO");
			}
		}
	}
}