import java.util.Scanner;
public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        long n=sc.nextLong();
        printString(n);
       
      
          
        
        }
        
        
        
        private static void printString(long columnNumber) 
    { 
        // To store result (Excel column name) 
        StringBuilder columnName = new StringBuilder(); 
  
        while (columnNumber > 0) { 
            // Find remainder 
            long rem = columnNumber % 26; 
  
            // If remainder is 0, then a 
            // 'Z' must be there in output 
            if (rem == 0) { 
                columnName.append("z"); 
                columnNumber = (columnNumber / 26) - 1; 
            } 
            else // If remainder is non-zero 
            { 
                columnName.append((char)((rem - 1) + 'a')); 
                columnNumber = columnNumber / 26; 
            } 
        } 
  
        // Reverse the string and print result 
        System.out.println(columnName.reverse()); 
    } 
}