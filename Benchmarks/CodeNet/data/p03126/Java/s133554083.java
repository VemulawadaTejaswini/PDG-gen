import java.util.Scanner;
import java.util.ArrayList;
 
public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = Integer.parseInt(scanner.next());
    int M = Integer.parseInt(scanner.next());
    
    ArrayList<Integer> answer = new ArrayList<Integer>();
    
    for(int i=0;i<N;i++){
      int K = Integer.parseInt(scanner.next());
      if(i != 0){
      	int[] A;
        A = new int[K];
      }
      for(int j=0;j<K;j++){
        if(i == 0){
          answer.add(Integer.parseInt(scanner.next()));
        }
        else{
          A[j] = Integer.parseInt(scanner.next());
        }
      }
      for(int k=0;k<A.length;k++){
        if(!answer.contains(A[k])){
          answer.remove(A[k]);
        }
      }
    }
    System.out.println(answer.size());
  }
}