import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args) throws IOException
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=br.readLine())!=null){
			System.out.println(fact(Integer.parseInt(s)));
		}
    }
    
    private static long fact(int n)
    {
    	if(n==0) return 0;
    	if(n==1) return 1;
    	return fact( n, 1, 0);
    }
    
    private static long fact(int n,long temp, long pre)
    {
        if(n==2) return temp * 2;
        else     return fact(n-1,temp*n, temp);
    }
}