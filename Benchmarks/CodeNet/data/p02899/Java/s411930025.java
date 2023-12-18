import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int[][] stu = new int[N][2];
    for(int i = 0; i < N; i++){
      int a = Integer.parseInt(sc.next());
      stu[i][0] = a;
      stu[i][1] = i+1;
    }
    Arrays.sort(stu, (a,b)->Integer.compare(a[0], b[0]));
    
    for(int i = 0; i < N; i++){
      System.out.print(stu[i][1]);
      System.out.print(" ");
    }
    System.out.println("");
  }
}