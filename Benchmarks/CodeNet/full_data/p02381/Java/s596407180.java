import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				scan.close();
				break;
			}
			int sum = 0;
			int s[] = new int[n];
			for(int i = 0; i < n; i++){
				s[i] = scan.nextInt();
				sum += s[i];
			}
			double m = Double.valueOf(sum) / Double.valueOf(n);
			double sig = 0;
			for(int i = 0; i < n; i++){
				sig += Math.pow(s[i] - m, 2);
			}
			double a = Math.sqrt(sig / n);
			System.out.println(a);
		}
	}
}