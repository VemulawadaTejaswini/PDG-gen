import java.lang.*;  
import java.io.*;  
import java.util.*;  
  
class Main
{ 
      
// To return char for a value. For  
// example '2' is returned for 2.  
// 'A' is returned for 10. 'B' for 11 

static char reVal(long num) 
{ 
    long o =num+'a'-1;
    return (char)o;
} 
  
// Function to convert a given decimal number 
// to a base 'base' and 
static String fromDeci(long base1, long inputNum) 
{ 
    String s = ""; 
  
    // Convert input number is given  
    // base by repeatedly dividing it 
    // by base and taking remainder 
    while (inputNum > 0) 
    { 
        s += reVal(inputNum % base1); 
        inputNum /= base1; 
    } 
    StringBuilder ix = new StringBuilder();  
  
        // append a string into StringBuilder input1  
        ix.append(s);  
  
    // Reverse the result 
    return new String(ix.reverse()); 
} 
  
// Driver code 
public static void main (String[] args) 
{ 
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    System.out.println(fromDeci(26,n));
} 
} 