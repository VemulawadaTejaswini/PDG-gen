import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		int d = n % 10;
		int c = (n - d) % 100/10;
		int b = (n - d - c * 10) % 1000/100;
		int a = n / 1000;
		
		int answer;
		
		for(int i =0; i < 2; i++) {
			
			for(int j = 0; j < 2; j++) {
				
				for(int k = 0; k < 2; k++) {
					answer = a;
					if(i == 0) {
						answer += b;
					} else {
						answer -= b;
					}
					if(j == 0) {
						answer += c;
					} else {
						answer -= c;
					}
					if(k == 0) {
						answer += d;
					} else {
						answer -= d;
					}
					if(answer == 7) {
						System.out.println(a + (i==0?"+":"-")
								+b + (j==0?"+":"-")
								+c + (k==0?"+":"-")+d + "=7");
						System.exit(0);
					}
				}
			}
			
		}
		
		

	}

}
