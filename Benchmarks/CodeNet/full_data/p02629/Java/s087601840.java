import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Main m=new Main();
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    String value="";
	    while(n>0){
	     int rem=n % 26;
	     value=value+m.getCharForNumber(rem);
	     n=n/26;
	    }
	    StringBuilder sb=new StringBuilder();
	    sb.append(value.toLowerCase());
	    sb=sb.reverse();
	    System.out.println(sb); 
	}                                       
   	private String getCharForNumber(int i) {
    return i > 0 && i < 27 ? String.valueOf((char)(i + 64)) : null;
   } 
}