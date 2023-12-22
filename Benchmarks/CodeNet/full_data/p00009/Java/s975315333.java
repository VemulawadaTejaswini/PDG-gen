import java.util.*;
public class Main{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n,i,j,div,count;
    boolean prime;
    while(sc.hasNext()){
      count = 0;
      n = sc.nextInt();
      for(i = 2;i <= n;i++){
        prime = true;
        div = 0;
        for(j = 1;j <= i;j++){
          if(i % j == 0) div++;
          if(div > 2){
            prime = false;
            break;
          }
        }
        if(prime) count++;
      }
      System.out.println(count);
    }
  }
}