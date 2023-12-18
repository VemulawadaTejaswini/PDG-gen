import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = 0;
    int b = 0;
    int count = 0;
    for(int i = 0;i<n;i++){
      if(count % 2 == 0){
        a += sc.nextInt();
      }else{
        b += sc.nextInt();
      }
      count++;
    }
    System.out.println(a-b);
  }
}
