import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		String a,b,sum;
		for(int i = 0;i < n ; i++){
			a = sc.nextLine();
			b = sc.nextLine();
			sum = String.valueOf(a+b);
			if(sum.length() > 80){
				System.out.println("overflow");
				break;
			}
			System.out.println(sum);
		}
	}
}