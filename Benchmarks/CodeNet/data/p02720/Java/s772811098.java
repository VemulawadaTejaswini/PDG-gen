import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextInt();
    int k = 1;
    int l = 1;
    boolean flag = true;

    for (int j = 1; j < N+1; j++) {
      while(flag){
        k++;
        if(k<10){
          break;
        }else{
          l = k;
          while(l>1){
            l = l%10;
            int l2 = l/10;
            if((l - l2) == 1 ||(l - l2) == -1){
            }else{
              flag = false;
              break;
            }
          }          
        }
        }
      }      
    System.out.println(k+1); 
    return;
  }
}

