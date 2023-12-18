import static java.lang.System.out;
import java.util.Scanner;
import java.util.Arrays;
public class Main{
   public static void main(String[]aa){
      Scanner sc = new Scanner(System.in); 
      String[] S =sc.nextLine().split("");
      int count=0;
      for(int i=0;i<S.length;i++){
            if(S[i].equals("1")){
                  count++;
            }
      }
      out.println(count);
      sc.close();
   }
}
