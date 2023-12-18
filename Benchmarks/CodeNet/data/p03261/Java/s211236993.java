import java.util.*;

class Main{
	public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      int N = scan.nextInt();
      
      String previous = scan.next();
      String next;
      Set<String> used_words = new HashSet<String>();
      used_words.add(previous);
      
      while(N>1){
        next = scan.next();
        if(!((previous.charAt(previous.length()-1)==next.charAt(0))&&used_words.add(next))){
          System.out.println("No");
          scan.close();
          return;
        }
        previous = next;
        N--;
      }//while
      scan.close();
      System.out.println("Yes");
      
    }
}