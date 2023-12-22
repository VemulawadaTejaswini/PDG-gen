import java.util.*;

public class Main{
	public static void main(String[] args){
      	String S = "bakana";
      	String T = "banana";
      	int count = 0;
      	
      	for(int i = 0 ; i < S.length() ; i++){
          if(S.charAt(i) != T.charAt(i)){
            count++;
      	  }
      	}
      	System.out.println(count);
	}
}