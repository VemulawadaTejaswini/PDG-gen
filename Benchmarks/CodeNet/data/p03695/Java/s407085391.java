import static java.lang.System.out;
import java.util.Scanner;
import java.util.Arrays;
public class Main{
   public static void main(String[]aa){
      Scanner sc = new Scanner(System.in); 
      int N = sc.nextInt();
      int[] numarray = new int[N];
      for(int i=0;i<N;i++){
            numarray[i] =sc.nextInt();
      }
      int[] countarray = new int[8];
      int over = 0;
      for(int i=0;i<N;i++){
         int target = numarray[i];
         
         int j = target<400 ? 0:
         target< 800 ? 1:
         target<1200 ? 2:
         target<1600 ? 3:
         target<2000 ? 4:
         target<2400 ? 5:
         target<2800 ? 6:
         target<3200 ? 7:
         10;
         if(j ==10){
            over++;
         }else{
            countarray[j] =1;
         }
      }
      int count=0;
      for(int i:countarray){
            count+= i;
      }
      if(count!=0){
         out.print(count +" ");
      }else{
         out.print(over + " ");
      }
      out.print(Math.min(8,count+over));
   }
}