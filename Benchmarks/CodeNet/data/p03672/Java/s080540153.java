import java.io.PrintWriter; 
import java.util.Scanner; 
  
public class Main { 
 static Scanner in; 
 static PrintWriter out; 
 static void solve() { 
  String S = in.next(); 
  if (S.length() == 2) { 
   System.out.println(0); 
   return; 
  } 
  for(int i = 0; i < S.length(); i++) { 
   S = S.substring(0, S.length() - 2); 
   String first = S.substring(0, S.length()/2); 
   String second = S.substring(S.length()/2, S.length()); 
   if (first.equals(second)) { 
    System.out.println(S.length()); 
    return; 
   } 
  }    
 } 
 public static void main(String[] args) { 
  in = new Scanner(System.in); 
  out = new PrintWriter(System.out); 
  solve(); 
  out.flush(); 
  out.close(); 
  in.close(); 
 }
}