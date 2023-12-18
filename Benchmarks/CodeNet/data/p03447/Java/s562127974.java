import java.util.*;

public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int acoin = sc.nextInt();
    int bcoin = sc.nextInt();
    int ccoin = sc.nextInt();
    long total = sc.nextInt();
    int count = 0;
    
    for(int i=0;i<=acoin;i++){
      if(i*500 > total){
        break;
      }
      if(i*500 == total){
        count++;
        break;
      }
      
      for(int j=1;j<=bcoin;j++){
        if(i*500+j*100 > total){
          break;
        }
        if(i*500+j*100 == total){
          count++;
          break;
        }
        for(int k=1;k<=ccoin;k++){
          if(i*500+j*100+k*50 > total){
            break;
          }
          if(i*500+j*100+k*50 == total){
            count++;
            break;
          }
        }
      }
    }
    
    System.out.println(count);
  }
}