import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main{
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    
    int aLength = scanner.nextInt();
    int bLength = scanner.nextInt();
    int K = scanner.nextInt();
    
    Deque<Double> a = new ArrayDeque();
    Deque<Double> b = new ArrayDeque();
    
    for(int i = 0;i < aLength;i++){
      a.push(scanner.nextDouble());
    }
    
    for(int i = 0;i < bLength;i++){
      b.push(scanner.nextDouble());
    }
    
    double usedTime = 0;
    int count = 0;
    
    for(usedTime = 0;usedTime < K;){
      if(a.isEmpty() && b.isEmpty())
        break;
      
      if(a.isEmpty()){
        usedTime += b.pop();
        if(IsOver(K,usedTime))break;
        count++;
        continue;
      }
      
      if(b.isEmpty()){
        usedTime += a.pop();
        if(IsOver(K,usedTime))break;
        count++;
        continue;
      }
      
      usedTime += a.peek() < b.peek() ? a.pop() : b.pop();
      if(IsOver(K,usedTime))break;
      count++;
      }
    System.out.println(count);
  }

  private static boolean IsOver(double max,double pop){
    return pop > max ? true : false;
  }
}