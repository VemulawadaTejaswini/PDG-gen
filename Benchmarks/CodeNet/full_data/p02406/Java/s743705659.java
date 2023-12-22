import java.util.Scanner;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int i=1;
    int x;

    while(i<=N){
      x=i;
      if(x%3==0) System.out.printf(" %d",i);
      else{
        while(x!=0){
          if(x%10==3){
            System.out.printf(" %d",i);
            break;
          }
          x/=10;
        }
      }
      i++;
    }
    System.out.printf("\n");
  }
}