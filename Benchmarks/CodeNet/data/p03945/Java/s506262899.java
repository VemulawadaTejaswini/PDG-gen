import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s=sc.next();
    long count=0;
    boolean w=false,b=false;
    if(s.substring(0, 1).equals("W"))w=true;
    else b=true;
    for(int i=1;i<s.length();i++) {
    	if(s.substring(i, i+1).equals("W")) {
    		if(!w) {
    			count++;
    			w=true;
    		}
    		b=false;
    	}else {
    		if(!b) {
    			count++;
    			b=true;
    		}
    		w=false;
    	}
    }
    
    System.out.println(count);
  }
}
