import java.util.Scanner;
 
public class Main { //クラス名はMain
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
      int N = in.nextInt();
      int x = 1;
      int y = 1;
      int z = 1;
      int count = 0;
      for (int i = 1 ;i<N+1;i++){
      for (x = 1 ;x<N;x++){
      for (y = 1 ;y<N;y++){
      for (z = 1 ;z<N;z++){
      int S = x + y + z;
      int T = x*y +y*z + z*x;
      
        if (S*S-T == i){
        count++;
      }
      }
      }
      }  
      System.out.println(count);
      count = 0;
      }
      }
}