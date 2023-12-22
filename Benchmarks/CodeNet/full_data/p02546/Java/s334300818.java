import java.util.Scanner;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String x=sc.next();
    int n=x.length();
    String ch=x.substring(n-1);
    
    		
    if(ch.equals("s")) {
    	System.out.println(x+"es");
    }else {
    	System.out.println(x+"s");
    }
    }
}