import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			long H = Integer.parseInt(sc.next());
			long W = Integer.parseInt(sc.next());
			if(H==1||W==1) {
				System.out.println(1);
			}else {				
				System.out.println((H*W+1)/2);
			}
		}	
	}
}