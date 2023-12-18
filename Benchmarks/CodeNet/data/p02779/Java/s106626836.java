import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
 
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    int N = scanner.nextInt();
    List<Integer> A = new ArrayList<Integer>();
    for(int i = 0;i < N;i++){
      A.add(scanner.nextInt());
    }
    
    String answer = "No";
    for(Integer a : A){
      for(Integer b : A){
        if(A.indexOf(b) != A.indexOf(a)){
          if(a == b){
            answer = "Yes";
          }
        }
      }
    }
    System.out.println(answer);
  }
}