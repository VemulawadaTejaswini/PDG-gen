import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
	        int x = sc.nextInt();
	        int t = sc.nextInt();
	        int a;
	        
	        if(x>t) {
	        a = x - t;
	        }else {
	        a = 0;	
	        }
	        System.out.println(a);
	}

}