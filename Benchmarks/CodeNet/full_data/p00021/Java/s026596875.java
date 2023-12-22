import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dataset = scanner.nextInt();
		double[] input = new double[8];
		double tmp1,tmp2;
		for(int i=0; i<dataset; i++){
			for(int j=0; j<8; j++){
				input[j] = scanner.nextDouble();
			}
			if(input[0] == input[2] || input[4] == input[6]){
				if(input[0] == input[4]){
					System.out.println("NO");
				}else{
					System.out.println("YES");
				}
			}else{
				tmp1 = (input[1]-input[3])/(input[0]-input[2]);
				tmp2 = (input[5]-input[7])/(input[4]-input[6]);
				if(tmp1==tmp2){
					if(tmp1*(input[4]-input[0])+input[1] == input[5]){
						System.out.println("NO");
					}else{
						System.out.println("YES");
					}
				}else{
					System.out.println("NO");
				}
			}
		}
	}
}