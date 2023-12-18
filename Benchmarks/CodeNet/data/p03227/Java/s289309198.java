import java.io.*;

public class Main{
    public static void main(String[] args){
	String S;

	try{
	    BufferedReader br
		= new BufferedReader(new InputStreamReader(System.in));

	    System.out.print("S = ");
	    buf = br.readLine();
	    S = Integer.parse(buf);

	} catch (Exception e) {
	    System.err.print("Error!");
	}

	if(S.length() == 2){
	    System.out.print(S);
	}

	else if( S.length() == 3){
	    S.charAt(1);
	    S.charAt(2);
	    S.charAt(3);
	    System.out.print(S.charAt(1) + S.charAt(2) + S.charAt(3));
	}
    }
}
