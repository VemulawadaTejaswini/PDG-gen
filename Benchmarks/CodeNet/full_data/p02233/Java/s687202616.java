import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


class Main {

    static int n;
    static int[] F;
	public static void main(String args[]) throws IOException{

		BufferedReader br =  new BufferedReader (new InputStreamReader (System.in) );
		 n = Integer.parseInt(br.readLine() );
        F = new int[n+1];
        Arrays.fill(F, -1 );

        System.out.println( makeFibonacci( ) );


	}


	public static int Fibonacci(int x){

		int ans;

		if(x == 0 ||x == 1 ){
		return	F[x] = 1;
		}

		else{

			ans = Fibonacci( x - 1) + Fibonacci( x - 2);
		}
		return ans;

	}


	public static int makeFibonacci(){

		F[0] = 1;
		F[1] = 1;
		for( int i = 2;i < n+1 ; i++ ){
			 F[i] = F[i-2] + F[i-1];
		}

		return F[n];
	}

}