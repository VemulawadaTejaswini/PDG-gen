
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){

			int a=sc.nextInt();
			if(a==0){
				break;
			}
			System.out.println(sumDigits(a));
		}


		}
	public static int sumDigits(int n) {
	    int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
		}


}
