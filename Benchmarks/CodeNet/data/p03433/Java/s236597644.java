import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    int a = sc.nextInt();
    for(int i = 0;i<20;i++){
      n -= 500;
      if(n <0){
        break;
        n+= 500;
      }
    }
    if(n>a){
      System.out.println("No");
    }else{
      System.out.println("Yes);
    }
  }
}