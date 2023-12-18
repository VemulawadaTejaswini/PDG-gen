import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
      	boolean b = true;
      
      for(int i = 0; i < num; i++){
        int a = sc.nextInt();
        if(a % 2 == 0){
          if(a % 3 != 0 || a % 5 != 0){
            b = false;            
            break;
          }
        }
      } 
      if(b == false){
        System.out.println("DINIED");
      }else{
        System.out.println("APPROVED");
      }
    }
}