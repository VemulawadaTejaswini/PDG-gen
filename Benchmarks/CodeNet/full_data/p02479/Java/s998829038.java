import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		sc.close();
		
		float s = (float)(r*r*Math.PI);
		float l = (float)(2*r*Math.PI);
		System.out.println(s + " " + l);
	}
}