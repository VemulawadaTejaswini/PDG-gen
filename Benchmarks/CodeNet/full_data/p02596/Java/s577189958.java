import java.util.*;
import java.math.BigDecimal;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%2==0 || n%5 == 0){
			System.out.println("-1");
			return;
		}
		int tmp = 0;
		for(int i=0;i<n;i++){
			tmp = tmp * 10 + 7;
			if(tmp%n==0){
				System.out.println(i+1);
				return;
			}else{
				tmp = tmp % n;
			}
		}
		System.out.println("-1");
  }
}