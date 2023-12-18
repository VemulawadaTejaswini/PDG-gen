import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
 
public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    List<Integer> xList = new ArrayList<>();
    for(int i = 0;i < N;i++){
      xList.add(scanner.nextInt());
    }
    int sum = 0;
    for(int x : xList){
      sum = sum + (int)Math.pow((x - N),2);
    }
    System.out.println(sum);
  }
}
