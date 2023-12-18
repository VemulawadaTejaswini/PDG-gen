import java.util.Scanner;

public class Main{
  public static void main(String[] args){
  	Scanner scan = new Scanner(System.in);
    
    String str = scan.next();
   
    int len = str.length();
    len--;
    
    String ans = new String();
    int i;
    int cnt = 0;
    for(i = 0; i < len; i++){
      if(ans.length() == 0 && str.charAt(i) =='B'){
      	
      }
      else if(str.charAt(i) != 'B' && str.charAt(i + 1) != 'B'){
      	ans += str.charAt(i);
      }
      else if(str.charAt(i) != 'B' && str.charAt(i + 1) == 'B'){
      	cnt--;
      }
      else if(ans.length() != 0 && str.charAt(i) =='B'){
      	cnt++;
      }
    }
    
    if(str.charAt(i) != 'B'){
    	ans += str.charAt(i);
    }
    else{
    	cnt++;
    }
    
    len = ans.length();
    len -= cnt;
    
    if(len > 0){
      for(i = 0; i < len; i++){
      	System.out.print(ans.charAt(i));
      }	
    }
  }
}