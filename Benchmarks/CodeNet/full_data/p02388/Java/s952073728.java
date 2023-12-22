import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String num="";
		int x=0;
		int sannzyou=0;

		  try{
			 num = input.readLine();
			  x=Integer.parseInt(num);
			  sannzyou=x*x*x;

			 System.out.println(sannzyou);

			  


		    }catch(IOException e)
		    {   System.out.println("Exception : " + e);
		    }


	}

}