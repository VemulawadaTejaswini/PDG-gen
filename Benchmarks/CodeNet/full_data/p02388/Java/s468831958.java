inport java.io.:;

class Main
{
   public static void main(String[] args) throw IOExcpection
   {
	BufferedReader br =
	 new BufferedReader(new InputStreamReader(System.in));

	String str = br.readLine();
	int x = Integer.parseInt(str);

	//System.out.println( x^3 );  //^???java??§???????????§?????????XOR??????????¨????
	System.out.println( x*x*x );
	//System.out.println( Math.pow(x, 3) );
	//System.out.println((int)Math.pow(x, 3));
   }
}