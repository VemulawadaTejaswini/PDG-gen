import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			int sum = 0;
			for(int i=1;i<n;i++){
				if(n%i==0) sum+=i;
			}
			if(n==sum) System.out.println("perfect number");
			else if(n<sum) System.out.println("abundant number");
			else System.out.println("deficient number");
		}
	}	
}