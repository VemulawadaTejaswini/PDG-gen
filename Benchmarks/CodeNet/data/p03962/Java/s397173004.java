import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    public static void main (String[] args) throws IOException
    {
    	Scanner sc = new Scanner(System.in);
    		int N = sc.nextInt();
    		int K = sc.nextInt();
    		int ans = (int) (K * Math.pow(K-1, N-1));
    		System.out.println (ans);
    		
    		
    }	
}
    