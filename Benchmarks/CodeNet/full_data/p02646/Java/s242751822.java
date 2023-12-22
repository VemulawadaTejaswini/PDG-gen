import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int V = s.nextInt();
		int B= s.nextInt();
		int W = s.nextInt();
		double T = s.nextInt();
		
		double D = Math.abs(A-B);
		double sokudosa = V-W;
		if(sokudosa<=0) {
		System.out.println("NO");	
		}
		else {
		if(D/sokudosa >=  T) {System.out.println("NO");}
		else {System.out.println("YES");}
		}
	}

}
