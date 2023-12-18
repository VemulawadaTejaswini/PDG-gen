import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		long M = sc.nextInt();
		long num = 0;
		if(N==1 && M==1)num = 1;
		else if(N==1 && M>2)num = M-2;
		else if(M==1 && N>2)num = N-2;
		else if(M==2 || N==2)num = 0;
		else num = N*M -  2*(N+M-2);
		System.out.println(num); 		
	}
}
	