import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int min = 2;
    for(int i=1;i<N;i++){
      min = Math.min(min*2, min+K);
    }
    System.out.println(min);
  }
}
