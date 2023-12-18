import java.util.Scanner;
 
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    int N = scan.nextInt();
    int A = scan.nextInt();
    int B = scan.nextInt();
    
    if((B - A) % 2 == 0){
      System.out.println((int)((B - A) / 2));
    }else{
      if(B-1 < N-A){
        System.out.println(B-1 + (int)((B - A) / 2));
      }else{
        System.out.println(N-A + (int)((B - A) / 2));
      }
    }
  }
}