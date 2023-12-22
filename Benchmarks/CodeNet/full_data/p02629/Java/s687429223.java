import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Main m=new Main();
	    Scanner sc=new Scanner(System.in);
	    long n=sc.nextLong();
	    String value="";
	    String val="";
	    while(n>0){
	     long rem=n % 26;
	     if(rem==0){
	     val="Z";
	     value=val+value;    
	     }
	     else{
	     value=m.getCharForNumber(rem)+value;
	     }
	     n=n-1;
	     n=n/26;
	     }
	    System.out.println(value.toLowerCase()); 
	}                                       
   	private String getCharForNumber(long i) {
    return i > 0 && i < 27 ? String.valueOf((char)(i + 64)) : "";
   } 
}
