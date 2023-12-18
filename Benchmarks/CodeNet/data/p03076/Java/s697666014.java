import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);   
      //時間の取得
	  int[] T = new int[5];
      int[] D = new int[5]; 
      for(int i=0;i<5;i++){
        T[i] = sc.nextInt();
      }
      //総時間
      int sum = 0;
         for(int i=0;i<5;i++){
             //あまり時間がないものの注文
             if(T[i]%10==0){
               D[i]=T[i];
             //あまり時間があるものの注文
             }else{
               D[i]=(T[i]/10)*10+10;
             }
          }
  
          //最後の注文のあまり時間はかからない
          int max = 0;
          for(int i=0;i<5;i++){
            if((D[i]-T[i])>max) {
               max=D[i]-T[i]; 
            }
             sum=sum+D[i];
          }
      
        System.out.println(sum-max);
    }
}