import java.util.*;
 
import java.io.*;
 
public class Main{
    
    
	public static void main(String[] $){
		Scanner s = new Scanner(System.in);
        int K = s.nextInt();
        String S = s.next();
        if(S.length() <= K){
            System.out.println(S);
        }else{
            for(int i = 0; i < K; i++){
                System.out.print(S.charAt(i));
            }
            System.out.println("...");
        }
        

 
	}
} 