import java.util.*;
public class Main {
	public static void main(String[] args){
	    
	    
		Scanner sc = new Scanner(System.in);
        
      	String s = sc.next();
      	
      	String word[] =s.split("");
      	
      	int i=0;
      	int j=0;
      	String A= "A";
      	
      	
      	while(word[i] != A){
      	    i+=1;
      	}
      	while(word[j]!="Z"){
      	    j++;
      	}
      	
      	
      	System.out.println(i);
 
    }
}