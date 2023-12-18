import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(),a = scanner.nextInt(),b = scanner.nextInt();
		int[] x = new int[n];
		for(int i=0;i<n;i++){
			x[i] = scanner.nextInt();
		}
		int count = 0;
		for(int i=0;i<n-1;i++){
			if((x[i+1] - x[i]) * a >= b ){
				count += b;
			}else{
				count += (x[i+1] - x[i]) * a;
			}
		}
		System.out.println(count);
	}

}
