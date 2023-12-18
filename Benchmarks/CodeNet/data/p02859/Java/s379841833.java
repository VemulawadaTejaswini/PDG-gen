import java.util.Scanner;

class Main {

  class RepeatingString {
    
    static boolean RS(String S, int n) {
    
      if (n%2 == 1) return false;
      
      for(int i = 0; i < n/2; i++)
        if(S[i] != S[i+n/2])
          return false;
      
      return true;
    }
  }
  
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    
    String S = stdIn.next();
     
    switch(RS(S, n)) {
     case true: System.out.println("Yes"); break;
     case false: System.out.println("No"); break;
    }
  }
}
