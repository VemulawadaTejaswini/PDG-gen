import java.util.*;

public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    while(true){
      int H = sc.nextInt();
      int W = sc.nextInt();
      if(H==0&&W==0)  break;
      for(int i=0;i<H;i++){
        System.out.print("#");
        for(int j=1;j<W-1;j++){
          if(i==0||i==H-1) System.out.print("#");
          else             System.out.print(".");
        }
        System.out.print("#");
        System.out.print("\n");
      }
      System.out.print("\n");
    }
  }
}

