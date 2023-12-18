import java.util.Scanner;
import java.util.Arrays;
public class Main{
   public static int getGcd(int x,int y){
     if(y%x==0){
        return x;
     }else{
        return getGcd(y%x,x);
     }//14,21     21%14 7,14 2,7 
   }
      //最小公倍数
   public static int getLcm(int x,int y){
      return x/getGcd(x,y)*y;   
   }

   public static void main(String[]args){
      
      Scanner sc = new Scanner(System.in);
      //System.out.println(getLcm(14,21));
      int N =sc.nextInt();
      int abc[] = new int[N];
      int answer = 1;
      int lcm=0;
      for(int i=0; i<N;i++){
         abc[i] =  sc.nextInt();
       
      }
      Arrays.sort(abc);
      //System.out.println(Arrays.toString(abc));
      for(int j=0;j<N-1;j++){
         abc[j+1]= getLcm(abc[j],abc[j+1]);
         //2つめに =2,3の最小公倍数6を入れる
         //3つめに6,4となり、12が入る
       

      }
      System.out.println(abc[N-1]);
}}