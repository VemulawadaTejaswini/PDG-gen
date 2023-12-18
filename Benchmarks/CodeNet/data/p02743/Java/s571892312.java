import java.util.*;  // Import the Scanner class

class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    a = sc.nextBigInteger();
    b = sc.nextBigInteger();
    c = sc.nextBigInteger();
    
    boolean x = 4*(a*b) < Math.pow(c - a - b,2);
    if(x){
     	System.out.println("Yes"); 
    }else{
      System.out.println("No");
    }
      
      
     sc.close();
  }
}