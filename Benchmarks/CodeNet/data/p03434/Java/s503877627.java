import java.util.*;

//くそコード
class Main{
  public static void main(String[] args){
    try(Scanner sc = new Scanner(System.in)){
      int n = Integer.parseInt(sc.nextLine());
      int a[] = new int[n];
      for(int i = 0; i < n; i++){
        a[i] = Integer.parseInt(sc.next());
      }
      int Alice = 0;
      int Bob = 0;
      Arrays.sort(a);
      if(((n - 1) % 2) == 0){
        for(int i = n - 1; i <= 0; i--){
          if((i % 2) == 0){
            Alice = Alice + a[i];
          }else{
            Bob = Bob + a[i];
          }
        }
      }
      
      if(((n - 1) % 2) != 0){
        for(int i = n - 1; i <= 0; i--){
          if((i % 2) != 0){
            Alice = Alice + a[i];
          }else{
            Bob = Bob + a[i];
          }
        }
      }
        
      System.out.println(Alice - Bob);
      
      /*for(int i = 0; i < n - 1; i++){
        if((i % 2) == 0){
          Alice = Alice + a[i];
        }else{
          Bob = Bob + a[i];
        }
      }
      System.out.println(Alice - Bob);
      */
    }
  }
}
          
      