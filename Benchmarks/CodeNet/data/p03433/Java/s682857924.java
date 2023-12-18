import java.util.Arrays;
import java.util.Scanner;
 
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ans = 0;

    int n = sc.nextInt();
    int a = sc.nextInt();
    boolean check = true;
    for(int i=0; i<20; i++){
      for(int j=0; j<a; j++){
        if(n == 500*i+j){
          check = false;
        }
      }
    }
    
    if(check){
      System.out.println("No");
    } else {
      System.out.println("Yes");
    }
    sc.close();
  }
}
