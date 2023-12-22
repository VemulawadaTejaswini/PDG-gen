import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N = Integer.parseInt(scan.nextLine());
    String[] readA = scan.nextLine().split(" ", N);
    List<Integer> a = new ArrayList();
    for(String a_i: readA){
      a.add(Integer.parseInt(a_i));
    }
    
    int count = 0;
    for (int i=0; i<N; i+=2){
      if(a.get(i)%2 == 1){
        count++;
      }
    }
    
    System.out.println(count);
  }
}