import java.util.*;

public class Main{
	public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      int A = s.nextInt();
      int B = s.nextInt();
      int C = s.nextInt();
      
      int nana=0, go=0;
      if(A == 5){ go++;} else if(A == 7) {nana++;}
      if(B == 5){ go++;} else if(B == 7) {nana++;}
      if(C == 5){ go++;} else if(C == 7) {nana++;}
      
      if(go == 2 && nana == 1){
      	System.out.println("YES");
      }else{
      	System.out.println("NO");
      }
    }
}