import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        
		int N = sc.nextInt();
      
		String S = sc.next();
        String T = sc.next();          
 
      int i = 0;

      char[] Schar =  S.toCharArray();
      char[] Tchar =  T.toCharArray();
      
      for (i=0; i < N; i++) {
      System.out.print(Schar[i]);
      System.out.print(Tchar[i]);  
      } 
	
	return;

	}
}