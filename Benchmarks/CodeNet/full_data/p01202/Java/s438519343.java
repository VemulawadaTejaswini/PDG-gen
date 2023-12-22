import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;
 
 
public class Main{
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	
    	final int N = sc.nextInt();
    	for(int tt = 0; tt < N; tt++){
    		char[] input = sc.next().toCharArray();
    		
    		boolean flag = false;
    		for(int i = 0; i < input.length / 2; i++){
    			if(input[i*2] == input[i*2+1]){
    				flag = true;
    				break;
    			}
    		}
    		
    		if(flag){
    			System.out.println("No");
    		}else{
    			System.out.println("Yes");
    		}
    	}	
        
    }
     
}