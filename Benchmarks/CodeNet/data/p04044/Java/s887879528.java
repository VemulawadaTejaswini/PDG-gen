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
    	int L = sc.nextInt();
    	String ans = "";
    	List<String> array = new ArrayList<String>();
    	
    	for (int i = 1;i <= N+1 ; i++){
    		String s = sc.nextLine();
    		array.add(s);
    	}
    	
    	Collections.sort(array);
    	
    	for (int i=1 ; i <=N ; i++){
    		ans += array.get(i);
    	}
    	
    	System.out.println(ans);
    	
    	
    	
    	
    }
}
   