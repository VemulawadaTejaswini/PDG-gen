import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        
        int prime_number[] = {11, 31, 41, 61, 71,
        		101,131,151,181,191,
        		211,241,251,271,281,
        		311,331,401,431,461,
        		491,521,541,571,601,
        		631,641,661,691,701,
        		751,761,811,821,881,
        		911,941,971,991,1021,
        		54941, 55021, 55051, 55061, 55171, 
        		55201, 55291, 55331, 55351, 55381, 
        		55411, 55441, 55501, 55511, 55541};
        
        
        
        
        	System.out.print("2");
        
        for(int i=0;i<N-1;i++)
        	System.out.print(" "+prime_number[54-i]);
        

     
    }

}
