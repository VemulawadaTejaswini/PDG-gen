import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int numDigit = 1;
		int total = 0;
		for(int i = 1;i <= n;i++) {
		    if(i % 10 == 0) numDigit++;
		    int sum = 0;
		    int tmp = i;
		    for(int j = numDigit;j > 0;j--) {
		        int num = (int) (tmp * Math.pow(10, -1 * (j - 1)));
		        sum += num;
		        if(sum > b) break;
		        tmp -= num * Math.pow(10, j - 1);
		    }
		    
		    if(sum >= a && sum <= b) total += i;
		}
		
		System.out.println(total);
    }
}