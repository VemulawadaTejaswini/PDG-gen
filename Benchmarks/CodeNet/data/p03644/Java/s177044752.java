import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int c = 0;

		while(n>0){
			if(n%2==0){
				n = n/2;
				c = c+1;
			}
		}
			
		System.out.print(c);
		
		sc.close();
	}
}