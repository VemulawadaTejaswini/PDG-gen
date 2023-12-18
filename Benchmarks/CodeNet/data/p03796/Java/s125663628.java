import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		
		long N = scan.nextLong();
		
		
		
		System.out.println(kaijou(N));
		
	}
	
	
	
	public static long kaijou (long a ){
		if(a==0){
			return 1;
		}else{
			return a*kaijou(a-1)%((long)Math.pow(10, 9)+7);
		}
	}

}