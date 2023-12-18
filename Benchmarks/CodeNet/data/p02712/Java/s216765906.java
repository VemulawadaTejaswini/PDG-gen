import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int sum=0;
		int sum1=0;
		for(int i=0;i<c;i++) {
			sum+=i;
			if(i%3==0||i%5==0) {
				sum1+=i;
			}
		}
		System.out.println(sum-sum1);


	}

}
