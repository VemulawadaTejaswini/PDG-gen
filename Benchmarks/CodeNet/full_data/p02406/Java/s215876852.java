import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static int n, i;

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        i = 1;
        try{
        	CHECK_NUM(i);
        }catch(NoClassDefFoundError e){
        	//????????????
        }
	}

	public static void CHECK_NUM(int x){
		try{
		  if ( x % 3 == 0 ){
		    System.out.print(" " + i);
		    END_CHECK_NUM(i);
		  }
		  INCLUDE_3(i);
		}catch(StackOverflowError e){
        	//System.out.println();
        	//System.out.println("StackOverflowError happens when i = " + i);
        	new RefreshStack();
        	if(i <= n){
        		CHECK_NUM(i);
        	}else{
        		System.exit(0);
        	}
        }
	}

	public static void INCLUDE_3(int x) throws StackOverflowError{
		if ( x % 10 == 3 ){
			System.out.print(" " + i);
		    END_CHECK_NUM(i);
		  }
		  x /= 10;
		  if ( x > 0) INCLUDE_3(x);
		  END_CHECK_NUM(i);
	}

	public static void END_CHECK_NUM(int x) throws StackOverflowError{
		i = x;
		  if ( ++i <= n ) {
			  CHECK_NUM(i);
		  }else{
			  System.out.println();
			  System.exit(0);
		  }
	}
}

class RefreshStack extends Exception{
}