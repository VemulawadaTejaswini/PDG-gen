import java.util.Scanner;

public class F0413{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){
      int H = sc.nextInt();
      int W = sc.nextInt();
      if(H==0 && W==0){
        break;
      }else{
        for(int i=0;i<W;i++){
            System.out.printf("#");
        }
        System.out.printf("\n");
        for(int j=1;j<H-1;j++){
          System.out.printf("#");
          for(int i=1;i<W-1;i++){
            System.out.printf(".");
          }
          System.out.printf("#\n");
        }
        for(int i=0;i<W;i++){
          System.out.printf("#");
        }
        System.out.printf("\n\n");
      }
    }
  }
}