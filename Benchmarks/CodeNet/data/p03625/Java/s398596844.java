import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Main{
   public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int sticks[] = new int[N];
      int Sides[] = new int[2];
      for(int i=0; i<N; i++){
         sticks[i] = sc.nextInt();
      };
      Arrays.sort(sticks);

      
      for(int j=0; j<N-1;j++){
         if(sticks[j] ==sticks[j+1] && Sides[0] == 0){
            Sides[0] = sticks[j];
            j+=1;
         }else if(sticks[j] ==sticks[j+1] && Sides[1] == 0){
            Sides[1] = sticks[j];
            break; 
         }else{
           // continue; 
         }
      }
         if(sticks[0] == 0){
            System.out.println(0);
         }else{
            System.out.println(Sides[0]*Sides[1]);
         }
         // System.out.println(Arrays.toString(sticks));
      
   }
}