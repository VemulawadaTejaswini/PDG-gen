import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), M = sc.nextInt();
		if(N>M){
			N^=M;
			M^=N;
			N^=M;
		}
		
		if(N==1 && M==1){
			System.out.println(1);
		}
		else if(N==1){
			System.out.println(M-2);
		}
		else{
			System.out.println((long)(N-2) * (M-2));
		}
	}

}
