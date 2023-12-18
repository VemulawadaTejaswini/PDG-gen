import java.util.*;
 import java.util.Comparator;
 
public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    List<Integer> list = new ArrayList<Integer>();
    
    for(int i=0; i<N;i++){
      int num = sc.nextInt(); 
      list.add(num);
    }
    
    list.sort(Comparator.naturalOrder());
    
    int alice_sum = 0;
    int bob_sum = 0;

    for(int i=0;i<N;i++){
      if (i % 2 == 0){
        alice_sum += list.get(i);
      }
      else
      {
        bob_sum += list.get(i);
      }
    }
    
    System.out.println(alice_sum-bob_sum);
  }
}