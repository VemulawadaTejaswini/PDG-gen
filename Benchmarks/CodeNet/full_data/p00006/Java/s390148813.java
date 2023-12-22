import java.io.File;
import java.util.HashSet;
import java.util.Scanner;


public class Main {

		  public static void main(String[] args) throws Exception{
			  
		  try {
		        Scanner input = new Scanner(System.in);

		        while (input.hasNext()) {
		         String reverse;
		         String string = input.nextLine();
		         reverse = new StringBuilder(string).reverse().toString();
		         System.out.println(reverse);
		        }    
		         	        
		        input.close();

		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }
		    }
		}