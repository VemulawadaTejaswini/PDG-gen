import java.util.*;

public class Main {
  public static void main(String[] args ){
    Scanner sc = new Scanner(System.in);
        // 整数の入力
        int a = sc.nextInt();
        // スペース区切りの整数の入力
        int b = sc.nextInt();
        int c = sc.nextInt();
   
     
    for(int i = 0; i <= c ; i++){
      if(i % a == 0 && i >= b ){
        System.out.println("OK");
        break;
      }else{
        System.out.println("NG");
        break;
      }
    }
    
    
	
  }
  
}