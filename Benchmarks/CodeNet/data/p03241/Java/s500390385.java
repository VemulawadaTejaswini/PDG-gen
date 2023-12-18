import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		for(int i=M/2; i>0; i--){
			if(M%i==0 && M/i>=N){
				System.out.println(i);
				return;
			}
		}
	}
}