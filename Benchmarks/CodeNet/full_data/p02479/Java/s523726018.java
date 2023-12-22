import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		
		int r=Integer.parseInt(scanner.next());
		System.out.println(r*r*Math.PI+" "+r*2*Math.PI);
	}
}