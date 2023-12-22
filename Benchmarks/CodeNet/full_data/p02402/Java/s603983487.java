import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) {
    	
    	try{
    		InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String buf = br.readLine();
			int n = Integer.parseInt(buf);
			String buf2 = br.readLine();
			StringTokenizer st=new StringTokenizer(buf2," ");
			if(0 <=n && n <=10000){
				int max=-1000000;
				int min=1000000;
				long sum=0;
				int a=0;
				for(int i=1;i <= n; i++){
					if(0 >= st.countTokens())	break;
					a=Integer.parseInt( st.nextToken() );
					if(0 >= a && a>=1000000)	return;
					if(max < a)
						max=a;
					if(min > a)
						min=a;
					sum+=a;
				}
				System.out.println(min+" "+max+" "+sum);
			}
		} catch(IOException e) {
    		System.err.println(e);
		} catch(NoSuchElementException e) {
    		System.err.println(e);
		}
    }
}