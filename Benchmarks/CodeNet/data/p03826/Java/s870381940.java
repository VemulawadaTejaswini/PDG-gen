import java.util.*;


public class Main{
           
    public static void main(String[] args){            
        
       Scanner sc = new Scanner(System.in);               
      
       int MOD = (int) (Math.pow(10, 9) + 7);
       
       int N = sc.nextInt();
       
       int count = 1;     
       for(int i = N; i >= 1;i--){
              count*=i;
       }
       
       int hoge = 0;
       for(int i = 1;i <= count;i++){
           if(count%i == 0){
               hoge++;
           }
       }
       
       System.out.println(hoge%MOD);
       
    }
                                       
}