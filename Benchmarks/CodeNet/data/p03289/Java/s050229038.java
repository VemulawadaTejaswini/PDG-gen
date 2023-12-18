import java.util.*;
import java.math.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    boolean cond1 = true;
    int cond2 =0;
    int count = 0;
    boolean flag= true;
    // to check condition 1 ( A at the begining)
    if(s.charAt(0) != 'A') cond1 = false;

    // to check condition 2 
    for(int i=2;i<=s.length()-1;i++) {
      if(s.charAt(i) == 'C') count++;
    }

    //to check condition 3
    for(int j=1;j<s.length()-1;j++) {
      if(Character.isUpperCase(j)) cond2++;
    }

    // to print result
    if(cond1 == true && count == 1 && cond2 == 1) {
      System.out.println("AC");
    } else {
      System.out.println("NO");
    }

    
      }


  }
