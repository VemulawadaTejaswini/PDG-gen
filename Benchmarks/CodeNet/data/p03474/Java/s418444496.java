import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
        int B = in.nextInt();
        String S = in.next();
		char[] s_chars = S.toCharArray();
        
      int flag = 0;
      if(s_chars[A]=='-'){
        for(int i = 0;i < A+B+1;i++){
          if(s_chars[i]=='-'){flag++;}
        }
      }
        if(flag==1){System.out.print("Yes");}
        else{System.out.print("No");}
        
	}
}
