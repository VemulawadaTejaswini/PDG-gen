import java.util.Scanner;

public class Main {

	public static void main(String[] args){
	    Scanner s = new Scanner(System.in);
	    while(s.hasNext()){
		String a = s.next();
		String out = "";
   		for(int i=0 ; i<a.length() ; i++){
		    if(a.charAt(i) == '@'){
			for(int j=0 ; j<Integer.parseInt("" + a.charAt(i+1)) ; j++)
			    out += String.valueOf(a.charAt(i+2));
			i+=2;
		    }
		    else
			out+=String.valueOf(a.charAt(i));
		}
		System.out.println(out);
	    }
      	}
}