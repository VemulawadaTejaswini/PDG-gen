import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		for(int i=1, l=M; i<l; i++){
			if(M%i==0 && i>=N){
				System.out.println(M/i);
				return;
			}
		}
	}
}