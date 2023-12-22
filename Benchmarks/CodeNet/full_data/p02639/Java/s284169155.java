import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		int [] x= {0,1,2,3,4,5};
		
		for(int i=1; i<=5; i++) {
			x[i]=sc.nextInt();
		}
		
		for(int i=1; i<=5; i++) {
			if(x[i]==0) {
				System.out.println(i);
			}
		}
		
 
	}
 
}
