import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int i=0;
		
		while(x!=0){
			i++;
			System.out.println("Case "+i+": "+x);
			x = sc.nextInt();
		}
		
	}

}