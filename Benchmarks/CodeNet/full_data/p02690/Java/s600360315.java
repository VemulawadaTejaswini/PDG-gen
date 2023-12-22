import java.util.*;
public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int X = sc.nextInt();
            int A = 0;
            int B = 0; 
            for(int i = 0; i < X / 2; i++){
              for(int j = 0;j > -X / 2; j--){
                if((i*i*i*i*i) -(j*j*j*j*j) == X){
                  A = i;
                  B = j;
                }
              }
            }
            System.out.println(A + " "+ B);
          }
}