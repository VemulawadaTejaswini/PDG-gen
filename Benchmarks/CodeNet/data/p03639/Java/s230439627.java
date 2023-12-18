import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int yon = 0;
    int ni = 0;
    for(int i = 0 ; i < n ; ++i){
      int num = sc.nextInt();
      if(num%4 == 0) yon++;
      else if(num%2 == 0) ni++;
    }
    
    if(yon >= n/2 || ni == n-2*yon) System.out.println("Yes");
    else System.out.println("No");
 
  }
}
