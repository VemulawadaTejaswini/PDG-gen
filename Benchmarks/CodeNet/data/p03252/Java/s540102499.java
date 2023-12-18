import java.util.Scanner;
import java.util.Arrays;


public class Main {
  public static void main (String[] args) {
    Scanner reader = new Scanner(System.in);
    String Sreader = reader.nextLine();
    String Treader = reader.nextLine();
    int[] S = new int[Sreader.length()];
    int[] T = new int[Treader.length()];
    boolean result = true;
    
   for (int i = 0; i < Sreader.length(); i++) {
     Character c = Sreader.charAt(i);
     S[i] = countOf(Sreader, c);
   }
    for (int i = 0; i < Treader.length(); i++) {
     Character c = Treader.charAt(i);
     T[i] = countOf(Treader, c);
      
   }
   Arrays.sort(S);
   Arrays.sort(T);
    
      for (int i = 0; i < Sreader.length();i++) {
          if (S[i] != T[i]) {
              result = false;
          }
      }
    
     if (result) {
     	System.out.print("Yes");
     } else {
     	System.out.print("No");
     }
  }
  static int countOf(String str, char target){
	int count = 0;

	for(char x: str.toCharArray()){
		if(x == target){
			count++;
		}
	}

	return count;
}
  
}