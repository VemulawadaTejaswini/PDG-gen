import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int tower = sc.nextInt();
    int num = sc.nextInt();
    int T[][] = new int[tower][2];
    int t_count[] = new int[tower];
    for(int i = 0;i < tower;i++){
      T[i][0] = sc.nextInt();
    }
    for(int i = 0;i < num;i++){
      int a = sc.nextInt();
      int b = sc.nextInt();
      t_count[a - 1]++;
      t_count[b - 1]++;
      if(T[a - 1][0] < T[b - 1][0]){
        T[b - 1][1]++;
      }
      else if(T[a - 1][0] > T[b - 1][0]){
        T[a - 1][1]++;
      }
    }
    int count = 0;
    for(int i = 0;i < tower;i++){
      if(T[i][1] == t_count[i]){
        count++;
      }
    }
    System.out.println(count);
  }
}
    