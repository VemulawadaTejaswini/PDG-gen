import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    
    int m = 0, sum = 0;
    for(int i = 0; i < N; i++){
      int n = Integer.parseInt(sc.next());
      sum += n;
      m = m < n ? n : m;
    }
    
    sum -= m;
    System.out.println(sum > m ? "Yes" : "No");
  }
}