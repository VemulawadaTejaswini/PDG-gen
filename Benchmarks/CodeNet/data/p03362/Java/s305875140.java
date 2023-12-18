import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        
        int prime_number[] = {4, 54919, 54941, 54949, 54959,
        		54973, 54979, 54983, 55001, 55009, 
        		55021, 55049, 55051, 55057, 55061, 
        		55073, 55079, 55103, 55109, 55117, 
        		55127, 55147, 55163, 55171, 55201, 
        		55207, 55213, 55217, 55219, 55229, 
        		55243, 55249, 55259, 55291, 55313, 
        		55331, 55333, 55337, 55339, 55343, 
        		55351, 55373, 55381, 55399, 55411, 
        		55439, 55441, 55457, 55469, 55487, 
        		55501, 55511, 55529, 55541, 55547};
        
        
        
        
        	System.out.print("2");
        
        for(int i=0;i<N-1;i++)
        	System.out.print(" "+prime_number[54-i]);
     
    }

}
