import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int X = sc.nextInt();
            int A = 0;
            int B = 0; 
            for(int i = 0; i < X; i++){
              for(int j = j < X; i++){
                if((i*i*i*i*i) -(j*j*j*j*j) == 33){
                  A = i;
                  B = j;
                }
              }
            }
            System.out.println(A + " "+ B);
          }
}