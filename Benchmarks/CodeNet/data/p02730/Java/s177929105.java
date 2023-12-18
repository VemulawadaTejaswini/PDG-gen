import java.util.*;
class Main
{
	public static void main(String[] args) 
    { 	Scanner s=new Scanner(System.in);
         String str = s.nextLine(); 
         StringBuilder input1 = new StringBuilder(); 
          StringBuilder input2 = new StringBuilder(); 
          StringBuilder s3 = new StringBuilder(); 
           StringBuilder s4 = new StringBuilder(); 
          String s1="",s2="";
          int c1,c2;
          int l=str.length();
          s1=str.substring(0,(l-1)/2);
          
         	
        
  
        if (isPalindrome(s1))  
        	c1=1;
            //System.out.print("Yes"); 
        else
        	c1=0;
        
       
          s2=str.substring((l-1)/2 +1,l);
          
        
  
        if (isPalindrome(s2))  
        	c2=1;
            //System.out.print("Yes"); 
        else
        	c2=0;
            //System.out.print("No"); 
 

        if ((isPalindrome(str))  && c1==1 && c2==1 ) 
        	
            System.out.print("Yes"); 
        else
        	System.out.print("No"); 

        	
    } 
    static boolean isPalindrome(String str) 
    { 
  
        // Pointers pointing to the beginning 
        // and the end of the string 
        int i = 0, j = str.length() - 1; 
  
        // While there are characters toc compare 
        while (i < j) { 
  
            // If there is a mismatch 
            if (str.charAt(i) != str.charAt(j)) 
                return false; 
  
            // Increment first pointer and 
            // decrement the other 
            i++; 
            j--; 
        } 
  
        // Given string is a palindrome 
        return true; 
    } 
}
