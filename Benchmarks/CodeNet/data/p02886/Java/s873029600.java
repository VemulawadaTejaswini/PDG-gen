import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    ArrayList<Integer> li = new ArrayList<>();
    for(int i = 0;i < N;i++){
      li.add(sc.nextInt());
    }
    int total = 0;
    for(int j = 1;j < N;j++){
      for(int k = 2;k < N;k++){
        total += li.get(j) * li.get(k);
      }
    }
    System.out.println(total);
  }
}
