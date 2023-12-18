import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

	
    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        int D = in.nextInt()-1;
        int X = in.nextInt();
        
        for(int i = 0;i<N;i++){
        	 int number = in.nextInt();
        	 X += D/number + 1;
        }
        
        System.out.println(X);
        in.close();
    }

	
}
