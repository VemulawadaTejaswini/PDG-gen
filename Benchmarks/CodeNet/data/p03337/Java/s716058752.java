import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
        public static void main(String[] args) throws IOException
        {
        	BufferedReader br = 
        			new BufferedReader(new InputStreamReader(System.in));
        	String str1 = br.readLine();
        	String str2 = br.readLine();
        	
        	int A = Integer.parseInt(str1);
        	int B = Integer.parseInt(str2);
        	
        	int num1 = A + B;
        	int num2 = A - B;
        	int num3 = A * B;
        	
        	if(num1 <= num2) {
        		if(num2 <= num3) {
        			System.out.println(num3);
        		} 
        		else {
        			System.out.println(num2);
        		}
        	}
        	else {
        		if(num3 <= num1) {
        			System.out.println(num1);
        		}
        		else {
        			System.out.println(num3);
        		}
        	}
        }
      
}
