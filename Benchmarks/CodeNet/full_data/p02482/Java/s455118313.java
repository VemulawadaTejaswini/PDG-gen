import java.io.*;

class Main
{
	public static void main(String []args)
	{
	System.out.println("???????????´??°?????\?????????");

	BufferedReader br=
	 new BufferedReader(new InputStreamReader(System.in));

	 String str =br.readLine();
	 	 int a=Integer.parseInt(str);
	 	 int b=Integer.parseInt(str);
	if(a>b){
 		System.out.println("a>b");
		}
		 else if(a<b) {
	  System.out.println("a<b");
  		}
  	  else if(a==b){
  		System.out.println("a==b");
  		}
	}	
}