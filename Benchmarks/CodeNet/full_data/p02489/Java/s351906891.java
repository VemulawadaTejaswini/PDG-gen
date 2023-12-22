import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int x;
		for(int i=1;(x=new Scanner(System.in).nextInt())!=0;i++){
			System.out.println("Case "+i+": "+x);
		}
	}
}