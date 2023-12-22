import java.io.File;
import java.util.HashSet;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception{
		 try {
		        Scanner input = new Scanner(System.in);
		        
		        while (input.hasNext()) {
		        	int n = input.nextInt();
		        	int c = 0;
		        	int fact =1;
		        
                   for(c =1; c<=n;c++) {
                	   
                	   fact = fact * c;

                   }
                   
                   System.out.println(fact);
		         }
		         
		   	         
		        input.close();

		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }
		    }
		}