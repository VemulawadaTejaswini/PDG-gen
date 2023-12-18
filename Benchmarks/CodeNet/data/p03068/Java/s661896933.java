import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int N = scan.nextInt();
      	String s = scan.next();
      	int k = scan.nextInt();
      	String b = s.substring(k-1, k-1);
      	for(int i = 0; i < N; i++){
        	if(s.substring(i, i) != b){
            	s.replaceAll(s.substring(i, i), "*");
            }
        }
     	System.out.print(s);
      
      
    }
 
}