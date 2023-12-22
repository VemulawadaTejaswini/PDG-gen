import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = 0;
    while(true) {
      int h = sc.nextInt();
      int w = sc.nextInt();
        if (H == 0 && W == 0) {
        break;
      }
      for(int i = 0;i < h;i++){
        for(int j = 0;j < w;j++){
          if(k == 0){
            System.out.printf("#", b);
            k = 1;
          }else{
            System.out.printf(".", b);
            k = 0;
          }
        }
      }
    }
  }
}