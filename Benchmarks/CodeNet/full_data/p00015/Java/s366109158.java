/**
* AOJ: 0015
* 4/29/19
**/

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
   
      int n = Integer.parseInt(sc.nextLine());
      String num1;
      String num2;
      String sum;
   
   
      for(int i = 0; i < n; i ++) {
         /*initialize/reset numbers*/
         num1 = sc.nextLine();
         num2 = sc.nextLine();
         sum = "";
               
         /*skip to next loop if num1 OR num2 is too large*/
         if(num1.length() > 80 || num2.length() > 80) {
            System.out.println("overflow");
            continue;
         }
         
         /* Calculate the length of the sum. 
         * Take longer digit and add one to its length to allow carry over
         */
         int digits = num1.length() > num2.length() ? (num1.length() + 1) : (num2.length() + 1);
         
         /*pad each number with 0s (ex. 223 + 5 => 0223 + 0005)*/      
         num1 = pad(num1, digits - num1.length());
         num2 = pad(num2, digits - num2.length());
         sum  = pad(sum, digits);
         
         /*summation*/
         for(int index = digits - 1; index >= 1; index --) {
            sum = add(sum, index, num1.charAt(index), num2.charAt(index));
         }
         
         /*checks if the first character is 0 and omit it if so*/
         sum = sum.charAt(0) == 48 ? sum.substring(1) : sum;
         
         /*checks if sum overflows*/
         if(sum.length() > 80) {
            System.out.println("overflow");
            continue;
         } else {
            System.out.println(sum);
         }      
      }//end of each calculation
   }// end of main method
   
   
   public static String pad(String original, int numZeros) {
      for(int i = 0; i < numZeros; i ++) {
         original = "0" + original;
      }
      return original;
   }
   
   public static String add(String original, int index, char c1, char c2) {
      int num1 = Character.getNumericValue(c1);
      int num2 = Character.getNumericValue(c2);
      int numOrg = Character.getNumericValue(original.charAt(index));
      
      int numericalSum = num1 + num2 + numOrg;
      
      int oneth = numericalSum % 10;
      int tenth = numericalSum / 10;
      
      return original.substring(0, index - 1) + tenth + oneth + original.substring(index + 1);
      
      
   }
}// end of class
