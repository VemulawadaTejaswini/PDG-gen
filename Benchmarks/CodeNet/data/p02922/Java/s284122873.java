import java.util.*;

public class Main {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B=sc.nextInt();
		int C=1;
		int count=0;
		while(true) {
			if(B==1)break;
			C +=(A-1);
			count++;
			if(C>=B)break;
		}
		System.out.println(count);
	}
}

