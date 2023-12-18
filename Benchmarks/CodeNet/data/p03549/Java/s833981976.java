import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        //String S = sc.next();

        int sec = 1900*M +(N-M)*100;
        
        int res = sec * (int)Math.pow(2,M);
        System.out.println(res);
        
        
                
            

        }
        
        

        
        
        }