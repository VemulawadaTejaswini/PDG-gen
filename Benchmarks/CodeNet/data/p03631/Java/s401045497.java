import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int x[] = new int[3];
    for(int i=0;i<3;i++){
      x[i] = N %10;
      N = N/10;
    }
    if(x[0] == x[2]){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
