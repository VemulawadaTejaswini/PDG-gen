import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		//code starts now
      	for(int i=0; i<s.length-1; i+=2){
   			if(s.charAt(i)!='R' && s.charAt(i)!='U' && s.charAt(i)!='D'){
              System.out.println("No");
              break;
            }
          
          if(s.charAt(i+1)!='L' && s.charAt(i+1)!='U' && s.charAt(i+1)!='D'){
              System.out.println("No");
              break;
            }
          j
          System.out.println("Yes");
          
          	
        }
	}
}