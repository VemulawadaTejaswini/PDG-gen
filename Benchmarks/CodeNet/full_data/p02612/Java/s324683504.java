import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int change = 0;
    for(int i=1;;i++){
      if(1000*i >= n){
        change = 1000*i - n ;
        break;
      }
    }
    System.out.println(change);
  }
}