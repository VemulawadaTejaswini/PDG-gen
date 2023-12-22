import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int sum = 0;
		int count = 0;
		for(int i = 0; i < 1000000; i ++){
			sum += 7 * ((int)Math.pow(10,i));
			if(sum % K == 0)
			break;
			else
			count ++;
		}
		if(sum % K == 0)
		System.out.println(count);
		if(sum % K != 0)
		System.out.println(-1);
	}
}