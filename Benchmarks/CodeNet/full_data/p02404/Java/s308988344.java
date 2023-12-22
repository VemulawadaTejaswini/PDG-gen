import java.util.Scanner;

class Main{
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
      while (true){
        int H = sc.nextInt();
        int W = sc.nextInt();
        if ((H == 0) && (W == 0)) break;
          for(int h = 0; h < W; h++){
            System.out.print("#");
          }
          System.out.println("");


            for(int i = 0; i < H-2 ; i++){
              System.out.print("#");
              for(int j = 0;  j < W-2 ; j++){
                System.out.print(".");
                }
                System.out.print("#");
                System.out.println("");
              }
          for(int k = 0; k < W; k++){
            System.out.print("#");
          }
          System.out.println("");
          System.out.println("");
  }
}
}
