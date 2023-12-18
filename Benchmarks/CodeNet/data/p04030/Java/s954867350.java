import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
 		
      	for(int i = 0;i < s.length()-1; i++){
          if(s.charAt(i) != 'B' && s.charAt(i+1) != 'B') System.out.print(s.charAt(i));
        }
      
     	if(s.charAt(s.length()-1) != 'B') System.out.print(s.charAt(s.length()-1));
        
	}
}
