import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		if(A>=B&&A>=C){
			if(A<B+C){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
		}
		else if(B>=A&&B>=C){
			if(B<A+C){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
		}
		else if(C>=A&&C>=B){
			if(C<A+B){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
		}
	}
}