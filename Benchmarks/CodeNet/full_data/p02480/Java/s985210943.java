class Scanner
 {
	 public static void main(String[] args)
	{
		 int x;
         System.out.println();
         InputStreamReader isr = new InputStreamReader(System.in);
         BufferedReader br = new BufferedReader(isr);
         try{
                 String buf = br.readLine();
                 x = Integer.parseInt(buf);
         }catch(Exception e){
                 x = 0;
         }
		System.out.println(x*x*x);   	
    }
}