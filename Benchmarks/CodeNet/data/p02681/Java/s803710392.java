import java.io.*;

class Main{
	public static void main(String []args)throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      	String S = br.readLine();
      	String T = br.readLine();
      	if(S.equals(T.substring(0, T.length() - 1)))
           System.out.println("Yes");
       	else
           System.out.println("No");
    }
}