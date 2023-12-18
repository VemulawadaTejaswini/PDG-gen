import java.util.*;

public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int[] numlist = Integer[N];
    
    for(int i=0; i<N;i++){
      numlist[i] = sc.nextInt();
    }
    
    Arrays.sort(numlist, Collections.reverseOrder());
    
    int alice_sum = 0;
    int bob_sum = 0;
    for(int i=0;i<N;i++){
      if (i % 2 == 0){
        alice_sum += numlist[i];
      }
      else
      {
        bob_sum += numlist[i];
      }
    }
    
    System.out.println(alice_sum-bob_sum);
  }
}

      
      
  