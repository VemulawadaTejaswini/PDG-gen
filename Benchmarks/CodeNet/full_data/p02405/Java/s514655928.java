import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int h, w, i, j, x, y;
    int k=0;

    h = sc.nextInt();
    w = sc.nextInt();

    j = h/2;

    for(i=0; i<h; i++){
      if(i%2==0 && w%2==0){
        for(k=0; k<w/2; k++){
          System.out.printf("#.");
        }
        System.out.printf("\n");
      }
      else if(i%2==0 && w%2==1){
        for(k=0; k<w/2; k++){
          System.out.printf("#.");
          System.out.printf("#");
        }
        System.out.printf("\n");
      }
      else if(i%2==1 && w%2==0){
        for(k=0; k<w/2; k++){
          System.out.printf(".#");
        }
        System.out.printf("\n");
      }
      else if(i%2==1 && w%2==1){
        for(k=0; k<w/2; k++){
          System.out.printf(".#");
          System.out.printf(".");
        }
        System.out.printf("\n");
      }
    }
  }
}

