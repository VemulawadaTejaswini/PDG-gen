import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		long lcm=0;
		for(int i=0;i<N;i++){
			long T=stdIn.nextLong();
			if(i==0)
				lcm=T;
			else{
				if(lcm!=T)
					lcm=lcm/GCD(lcm,T)*T;
			}
		}
		System.out.println(lcm);
	}
	static long GCD( long a, long b ) {
        if( a < b ) { long temp = a; a = b; b = temp; }
        if( b < 1 ) return -1;

        if( a % b == 0 ) return b;
        return GCD( b, a % b );
    }
}
