import java.util.*;
public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int min = 2147483647;
    int sum = 0;
    for(int i = 0;i<N;i++){
      int tmp = sc.nextInt();
      sum += tmp;
      if(min>tmp){
        min = tmp;
      }
    }
    System.out.println(sum-min);
  }
}