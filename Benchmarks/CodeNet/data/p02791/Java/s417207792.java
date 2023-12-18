import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    int N = scan.nextInt();
    
    int list[] = new int[N];
    
    for (int i = 0; i < N; i++){
      list[i] = scan.nextInt();
    }
    
    int count = 0;
    for (int i = 0; i < N; i++){
      
      boolean clear = false;
      
      for (int j = 0; j < i; j++){
        if (list[j] >= list[i]){
          clear = true;
          break;
        }
      }
      
      if (clear){
        count++;
      }
    }
    System.out.println(count);
  }
}