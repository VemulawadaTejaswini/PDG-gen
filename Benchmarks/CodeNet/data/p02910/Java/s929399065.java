import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		//code starts now
		boolean possible=true;
      	for(int i=0; i<s.length(); i+=2){
   			if(s.charAt(i)!='R' && s.charAt(i)!='U' && s.charAt(i)!='D'){
   			  possible=false;
              System.out.println("No");
              break;
            }
        }
        for(int i=1; i<s.length(); i+=2){
   			if(s.charAt(i)!='L' && s.charAt(i)!='U' && s.charAt(i)!='D'){
   			  possible=false;
              System.out.println("No");
              break;
            }
        }
        if(possible)
        System.out.println("Yes");
	}
}