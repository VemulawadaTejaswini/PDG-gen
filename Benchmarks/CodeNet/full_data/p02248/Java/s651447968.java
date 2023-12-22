import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
	    InputStreamReader input = new InputStreamReader (System. in);
	    BufferedReader buffer = new BufferedReader(input);
	    String stringT = buffer.readLine();
	    long processStart = System.currentTimeMillis();
    	String stringP = buffer.readLine();
    	
    	char[] charT = stringT.toCharArray();
    	for(int x=0; x<stringT.length() - stringP.length() +1 ; x++){
    		StringBuilder compare = new StringBuilder();
	    	for(int i=0; i<stringP.length(); i++){
	    		compare.append(charT[x+i]);
	    	}
	    	String temp = compare.toString();
	    	if(temp.equals(stringP)){
	    		System.out.println(x);
	    	}
    	}
    	long processEnd = System.currentTimeMillis();
//    	System.out.println("???????????????" + (processEnd - processStart)  + "ms");
	}
}