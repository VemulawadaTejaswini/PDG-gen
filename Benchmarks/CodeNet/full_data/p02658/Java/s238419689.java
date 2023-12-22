import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int cnt = sc.nextInt();
    int[] c = new int[cnt];
    int sum = 1;
    while(sc.hasNext()){
      for(int i = 0; i < cnt; i++){
        c[i] = sc.nextInt();
        sum *= c[i];
      }
      System.out.println(sum);
    }
  }
}