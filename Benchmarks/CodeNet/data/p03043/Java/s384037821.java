import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		String[] numSpl = num.split(" ");
		int n = Integer.parseInt(numSpl[0]);
		int k = Integer.parseInt(numSpl[1]);
		int point = 0;
		int count = 0;
		double p = 0;
		double out = 0;
		
		for(int i = 1; i <= n;i++){
			point = i;
			while(point < k){
				point = point *2;
				count++;
			}
			p = (1/(double)n) * Math.pow(0.5, count);
			out = out + p;
			count = 0;
		}
		System.out.println(out);
	}
}