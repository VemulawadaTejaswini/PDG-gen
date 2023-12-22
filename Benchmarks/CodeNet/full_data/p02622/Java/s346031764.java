import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	String s = sc.nextLine();
      	sc.hasNext();
      	String w = null;
      	String t = sc.nextLine();
      	for(int i=0; i<s.length(); i++){
          	char x = s.charAt(i);
          	char y = t.charAt(i);
        	if(x != y){
            	w += t.charAt(i);
            }
        }
      	System.out.println(w.length());
    }
}

