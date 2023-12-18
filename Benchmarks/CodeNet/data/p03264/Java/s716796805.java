import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		int K = in.nextInt();
		
		int a = K/2;
		if(K%2==0) {
			
			System.out.println(a*a);
		}else {
			System.out.println((a+1)*a);
				
		}
		
	
		in.close();
	}
}
