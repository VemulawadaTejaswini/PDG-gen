import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		int n;
		int K;
		for(int t = 0;t<30;t++){
			K = 0;
			n = scan.nextInt();
			for(int a = 2;a <= n;a++){
				int b;
				for(b = 2;b <= a;b++){
					if (a % b == 0){
						break;
					}
				}
				if(a == b){
					K++;
				}
			}
			System.out.println(K);
		}
	}
}