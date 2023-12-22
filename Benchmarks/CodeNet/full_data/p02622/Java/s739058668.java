import java.util.*;

public class Main{
	public static void main(String[] args){
      	String S = sc.next();
      	String T = sc.next();
      	int count = 0;
      	
      	for(int i = 0 ; i < S.length() ; i++){
          if(S.charAt(i) != T.charAt(i)){
            count++;
      	  }
      	}
      	System.out.println(count);
	}
}