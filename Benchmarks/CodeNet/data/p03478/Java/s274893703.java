import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		int sum=0;
		
		for(int i=1;i<=N;i++) {
				int num=i;
				int subSum= num % 10;
				while(num >= 10) {
					num=num / 10;
					subSum=subSum + num % 10;
				}
				if(A <= subSum && subSum <= B)sum = sum +i;
		}
		
		
		
		System.out.println(sum);
	}
}
