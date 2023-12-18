import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int M = scanner.nextInt();
    
    List<Integer>list = new ArrayList<Integer>();
    for(int i = 0;i < N;i++){
      list.add(scanner.nextInt());
    }
    
    int answer[] = new int[M];
    for(int i = 0;i < M;i++){
      int max = list.get(0);
      int index = 0;
      for(int a : list){
        if(a > max){
          index = list.indexOf(a);
          max = a;
        }
      }
      list.remove(index);
      answer[i] = max;
    }
    
    String x = "Yes";
    for(int i = 0;i < answer.length;i++){
      if((double)answer[i] < (1 / 4 / M)){
        x = "No";
      }
    }
    System.out.println(x);
  }
}