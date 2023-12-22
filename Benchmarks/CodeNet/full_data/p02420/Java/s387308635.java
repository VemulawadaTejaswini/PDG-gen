import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
         
        Scanner sc = new Scanner(System.in);
        String card;
        int m = 0;
        int h = 0;
        int sum = 0;
        String ans1 = "";
        String ans2 = "";
        
        while( true ){
            
            card = sc.next();
            
             if(card.equals("-")) break;
            
            m = sc.nextInt();
                
            for(int i=0;i<m;i++){
                
                h = sc.nextInt();
                
                sum += h;
                
            }
            
          while( true ){
              if(sum>=card.length()){
                  sum-=card.length();
              }else{
                  break;
              }
              
          }
            ans2 = card.substring(sum);
               ans1 = card.substring(0,sum);
               System.out.println(ans2 + ans1);
            
            sum = 0;
            
         }
        sc.close();
    }
}
