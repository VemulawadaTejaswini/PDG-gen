import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;


class Main {
	
	static long mod=1000000007;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s="";
		while((s=br.readLine())!=null){
			String[] a=s.split(" ");
			Long x=Long.parseLong(a[0]);
			Long y=Long.parseLong(a[1]);
			System.out.println(pow(x, y));
			
		}
	}

	public static long pow(long b,long p) {
		if(p==0){
			return 1;
		}else if(p%2==0){
			long result=pow(b, p/2);
			return ((result%mod)*(result%mod))%mod ;
		}else{
			long result=pow(b, p-1);
			return ((b%mod)*(result%mod))%mod ;
		}
		
	}

}