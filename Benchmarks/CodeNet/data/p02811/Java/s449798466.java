import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int x = sc.nextInt();
    int amount = 500*k;
      if(amount>=x){
    System.out.println("Yes");
      }else{
 	System.out.println("No");       
      }
}
}