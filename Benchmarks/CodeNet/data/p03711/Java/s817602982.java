import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] a = {1,3,5,7,8,10,12};
    int[] b = {4,6,9,11};
    int x = sc.nextInt();
    int y = sc.nextInt();
    for(int i = 0; i < a.length; i++){
      if(a[i] == x){
        for(int j = 0; j < a.length; j++){
          if(a[j] == y){
            System.out.println("Yes");
            System.exit(0);
          }
        }
        System.out.println("No");
        System.exit(0);
      }
    }
    for(int i = 0; i < b.length; i++){
      if(b[i] == x){
        for(int j = 0; j < b.length; j++){
          if(b[j] == y){
            System.out.println("Yes");
            System.exit(0);
          }
        }
      }
      System.out.println("No");
      System.exit(0);
    }
  }
}
