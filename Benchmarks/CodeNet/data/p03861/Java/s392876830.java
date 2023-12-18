import java.util.Scanner;
 
public class Main {
	
	public static void main(String[] args) throws Exception{	
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b= sc.nextInt();
		int x = sc.nextInt();
		
		int c = 0;
		
		for(int i=a; i<=b; i++){
			if(i % x == 0) c++;
		}
		
		System.out.println(c);
		
		
		
		sc.close();
	}
}