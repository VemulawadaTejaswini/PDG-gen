import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      	int[] array = new int[200];
        for(int i = 0 ; i < n ; i ++){
          array[i] = sc.nextInt();
        }
      	boolean flg = true;
      	int count = 0 ;
      while (flag) {
        for(int i = 0 ; i < n ; i ++){
          if(array[i] % 2 != 0){
            flg = false;
            break;
          }
          array[i] = array[i] / 2;
        }
        count ++ ; 
      } 
      
      System.out.print(count);
    }
}
