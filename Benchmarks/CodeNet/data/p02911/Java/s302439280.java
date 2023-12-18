import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner read = new Scanner(System.in);
      int n = read.nextInt(); int k = read.nextInt();
      int q = read.nextInt();
      int array[] = new int[n];
      for(int i = 0; i<n; i++){
          array[i] = k;
      }
      for(int i = 0; i<q; i++){
          int t = read.nextInt();
          for(int j = 0; j<n; j++){
              if(j == t-1){
                  continue;
              }
              else{
                  array[j]--;
              }
          }
      }
      for(int i = 0; i<n; i++){
          if(array[i]<=0){
              System.out.println("No");
          }
          else{
              System.out.println("Yes");
          }
      }
      
    }
}