import java.util.Scanner;
class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			long N = Long.parseLong(sc.next());
			long M = Long.parseLong(sc.next());
			long answer=s(N,M);
			
			System.out.println(answer);
		}
	}
	static long s(long N, long M){
		long A=0;
		if(M<=2*N){
			A=M/2;
		}else{
			A=(M+2*N)/4;
		}
		
		return A;
	}
}