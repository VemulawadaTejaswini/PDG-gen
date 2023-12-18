import java.util.*;

class Katana{
    int x;
    int y;
}

public class Main{

     public static void main(String []args){
      int N, H;
      Scanner sc = new Scanner(System.in);
      N = sc.nextInt();
      H = sc.nextInt();
      Katana[] katana = new Katana[N];
      Katana temp;
      int sum = 0;
      int count = 0;
      int num = 0;
      int max = 0;
      
      for(int i = 0; i<katana.length; i++){
          katana[i] = new Katana();
          katana[i].x = sc.nextInt();
          katana[i].y = sc.nextInt();
      }
      
      if(katana.length == 1){
          H = H - katana[0].y;
          count++;
          while(H >0){
              H = H - katana[0].x;
              count++;
          }
          System.out.println(count);
          return;
      }
      else{
      
          for(int i = 0; i<katana.length-1; i++){
              for(int j = 0; j<katana.length-1-i; j++){
                  if(katana[j].y < katana[j+1].y){
                      temp = katana[j];
                      katana[j] = katana[j+1];
                      katana[j+1] = temp;
                  }
              }
          }
          
          for(int i = 1; i<katana.length; i++){
              if(katana[max].x < katana[i].x)
                max = i;
          }
          
          for(int i = katana.length-1; i>=0; i--){
              if(katana[max].x > katana[i].y)
                num++;
          }
    
          for(int i = 0; i<katana.length-num; i++){
              sum = sum + katana[i].y;
              count++;
              if(H <= sum){
                  System.out.println(count);
                  return;
              }
          }
           
          H = H - sum;
          if((H % katana[max].x) == 0)
            count += H/katana[max].x;
          else
            count += H/katana[max].x + 1;
          
            System.out.println(count);
      }
     }
}