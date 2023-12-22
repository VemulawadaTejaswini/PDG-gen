import java.io.*;

public class Main{

	public static void main(String[] args) throws IOException{
	
	try{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str;
        while( (str = br.readLine() ) != null ){
        	System.out.printf("%d\n",countPrime(Integer.parseInt(str)));
        }
	}
	catch(Exception e){
		System.out.println(e);
	}
	}
	
	private static boolean isPrime(int n){
		for(int i = 2; i < n; i++ ){
			if(n%i == 0) return false;
		}
		return true;
	}
	
	private static int countPrime(int n){
		int count = 0;
		for(int i = 2; i <= n; i++){
			if( isPrime(i) )count++;
		}
		return count;
	}
	
}