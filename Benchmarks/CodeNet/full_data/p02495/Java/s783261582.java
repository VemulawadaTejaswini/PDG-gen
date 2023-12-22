import java.util.Scanner;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){
      int H = sc.nextInt();
      int W = sc.nextInt();
      if(H==0 && W==0){
        break;
      }else{
        for(int j=0;j<H;j++){
          if(j%2==0){
            for(int i=0;i<W/2;i++){
              System.out.printf("#.");
            }
            if(W%2!=0) System.out.printf("#");
            System.out.printf("\n");
          }else{
            for(int i=0;i<W/2;i++){
              System.out.printf(".#");
            }
            if(W%2!=0) System.out.printf(".");
            System.out.printf("\n");
          }
        }
        System.out.printf("\n");
      }
    }
  }
}