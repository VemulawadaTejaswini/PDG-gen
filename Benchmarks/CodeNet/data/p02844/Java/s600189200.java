import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
 
        int n = stdIn.nextInt();
        //int d1 = stdIn.nextInt();
        //int x = stdIn.nextInt();
        //int num[] = new int[3];
        String s = stdIn.next();
        char c[] = s.toCharArray();
        //int sum = 0;
        //boolean flag = false;
        //for(int i = 0; i < s.length(); i++){
        //}
        int pass[] = new int[1000];
        
        int count = 0;
        
        for(int i = 0; i < 1000; i++){
        	pass[i] = 0;
        }
        
        for(int i = 0; i < n - 2; i++){
        	for(int j = i + 1; j < n - 1; j++){
        		for(int k = j + 1; k < n; k++){
        			pass[Character.getNumericValue(c[i]) * 100  + Character.getNumericValue(c[j]) * 10 + Character.getNumericValue(c[k])] = 1;
        		}
        	}
        }
        
        for(int i = 0; i < 1000; i++){
        	if(pass[i] == 1){
        		count++;
        	}
        }
        
        System.out.println(count);
        
 
        //System.out.println();
        //System.out.print();
    }
}