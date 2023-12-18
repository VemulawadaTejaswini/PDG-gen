import java.util.*;

public class Main {
  public static void main(String[] args){
    
    int five_count = 0;
    int seven_count = 0;
    int a = -1;
    
    Scanner sc = new Scanner(System.in);
    
    for(int i = 0; i<3; i++){
      a = sc.nextInt();
      if(a == 5){
        five_count++;
      }else if(a == 7){
        seven_count++;
      }else{
        System.out.println("NO");
        break;
      }
    }
    
    if(five_count == 2 && seven_count == 1){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}
