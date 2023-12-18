import java.util.Scanner;
import java.util.Arrays;
public class Main{
   public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      int N =sc.nextInt();
      int abc[] = new int[N];

      for(int i=0; i<N;i++){
         abc[i] =  sc.nextInt();
      }
      Arrays.sort(abc);
      for(int j=0;j<N-1;j++){
         abc[j+1]= getLcm(abc[j],abc[j+1]); 
      }
      System.out.println(abc[N-1]);
   }
   public static int getGcd(int x,int y){
     if(y%x==0){
        return x;
     }else{
        return getGcd(y%x,x);
     }
   }

   public static int getLcm(int x,int y){
      return x/getGcd(x,y)*y;   
   }
}