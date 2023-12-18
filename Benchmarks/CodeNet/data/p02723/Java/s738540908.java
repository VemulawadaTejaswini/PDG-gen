import java.util.*;
public class Main{
  public static void main(String[] arga){
    Scanner v = new Scanner(System.in);
    String s = v.nextLine();
    String out = "";
    if(cofe(s) == true){
    	out ="Yes";
    }else{
    	out="No";
    }
    System.out.println(out);
    v.close();
    }
    public static boolean cofe(String s){
    	boolean out = false;
    	if(s.charAt(2) == s.charAt(3)){
    		out = true;
    	
    	if(s.charAt(4) == s.charAt(5)){
    		out = true;
    	}
    	}
    	return out;
    }
}