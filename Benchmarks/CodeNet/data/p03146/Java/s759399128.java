import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    boolean[] b = new boolean[1000001];
    b[n] = true;
    int i = 2;
    while(true){
      if(n%2 == 0){
        n /= 2;
      }else{
        n = n*3+1;
      }
      if(b[n]){
        break;
      }else{
        b[n] = true;
      }
      i++;
    }
    System.out.println(i);
  }
}