import java.util.*;

class Main
{
  	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
  		int n = Integer.parseInt(sc.next());
  		String as= sc.next();
  		char[] s = as.toCharArray();
		int k = Integer.parseInt(sc.next());
  		for(int i=0; i<n; i++){
      		if(s[i]!=s[k]){
      			s[i]='*';		
      		}
          	System.out.print(s[i]);
    	}
    }
	
}
