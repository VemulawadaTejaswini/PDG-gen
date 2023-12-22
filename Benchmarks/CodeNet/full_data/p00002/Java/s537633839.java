import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(in.hasNextInt()==true){
		int n = in.nextInt();
		int m = in.nextInt();
		int keta = (int)Math.log10(n+m) + 1;
		System.out.println(keta);
		}
				
		

	}

}