import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String A="";
		String B="";
		int a=0;
		int b=0;
		int menseki=0;
		int syuu=0;

		  try{
              //System.out.println("1??????");
			  A = input.readLine();
			  a=Integer.parseInt(A);
			 // System.out.println(a);
			 // System.out.println("?????????");
			  B= input.readLine();
			  b=Integer.parseInt(B);
			  menseki=a*b;//
			  syuu=2*(a*b);
			  System.out.println(menseki);
			  System.out.println(syuu);


		    }catch(IOException e) {   System.out.println("Exception : " + e);
		    }


	}//20punn

}