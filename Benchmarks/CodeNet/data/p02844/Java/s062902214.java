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
 
        int sum = n * (n - 1) * (n - 2) / 3;
 
        int pass[] = new int[sum + 1];
		int count = 0;
		
        for(int i = 0; i < n - 2; i++){
        	for(int j = i + 1; j < n - 1; j++){
        		for(int k = j + 1; k < n; k++){
        			pass[count] = Character.getNumericValue(c[i]) * 100  + Character.getNumericValue(c[j]) * 10 + Character.getNumericValue(c[k]);
        			count++;
        		}
        	}
        }
        
        Arrays.sort(pass);
        
        
        for(int i = 0; i < pass.length - 1; i++){
        	if(pass[i] == pass[i + 1]){
        		sum--;
        	}
        }
 
        System.out.println(sum);
        
 
        //System.out.println();
        //System.out.print();
    }
}