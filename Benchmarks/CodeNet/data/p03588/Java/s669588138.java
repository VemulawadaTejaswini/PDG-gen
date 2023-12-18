import static java.lang.System.out;
import java.util.Scanner;
import java.util.Arrays;
public class Main{
   public static void main(String[]aa){
      Scanner sc = new Scanner(System.in); 
      int N = sc.nextInt();
    
      
      String[][] st = new String[N][2];
      int max =0;
      int min =Integer.MAX_VALUE;
      for(int i=0;i<N;i++){
            Scanner sct = new Scanner(System.in);
            st[i] =  sct.nextLine().split(" ");
             min = Math.min(Integer.parseInt(st[i][1]),min);
            max = Math.max(Integer.parseInt(st[i][0]),max);
      }
      out.println(max+min);

      sc.close();
   }
}