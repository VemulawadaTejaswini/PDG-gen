import java.util.*;
public class Main {
	private static Scanner sc;
	 
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Long a = sc.nextLong();
		Long b = sc.nextLong();
		Long x = sc.nextLong();
		Long count;
		Long sum1 = a/x;
		if(sum1%x==0){
			sum1=sum1-1;
		}
		long sum2 = b/x;
		count = sum2-sum1;
		System.out.print(count);
		
	}

}
