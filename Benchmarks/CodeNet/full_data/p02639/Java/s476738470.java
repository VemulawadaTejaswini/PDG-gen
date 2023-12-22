import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    for(int i = 1;i<6;i++){
      int a = sc.nextInt();
      if(a == 0){
        System.out.println(i);
      }
    }
  }
}
