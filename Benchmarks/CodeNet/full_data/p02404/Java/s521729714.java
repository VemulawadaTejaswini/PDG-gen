import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    while(true){
      int H = sc.nextInt();
      int W = sc.nextInt();
      if(H == 0 && W == 0){
        break;
      }
      for(int x = 0; x < H; x++){
        if(x == 0 || x == H-1){
          for(int y = 0; y < W; y++){
            System.out.print("#");
          }
          System.out.println("");
        }else{
          for(int z = 0; z < W; z++){
            if(z == 0 || z == W-1){
              System.out.print("#");
            }else{
              System.out.print(".");
            }
　　　　　}
          System.out.println("");
        }
      }
      System.out.println("");
    }
  }
}
