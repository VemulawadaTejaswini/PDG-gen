import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    ArrayList<Integer> fruit = new ArrayList<Integer>();
    for(int i = 0;i < n;i++){
      fruit.add(sc.nextInt());
    }
    int sum = 0;
    for(int i = 0;i < k;i++){
      int min = 1001;
      for(int j = 0;j < fruit.size();j++){
        if(fruit.get(j) <= min){
          min = fruit.get(j);
          fruit.set(j,1001);
        }
      }
      sum += fruit;
    }
    System.out.println(sum);
  }
}
    