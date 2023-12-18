import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int[][] stu = new int[N][2];
    for(int i = 0; i < N; i++){
      stu[i][0] = Integer.parseInt(sc.next());
      stu[i][1] = i+1;
    }
    Arrays.sort(stu, (a, b)-> Integer.compare(a[0],b[0]));
    
    for(int i = 0; i < N; i++){
      if(i == N-1){
        System.out.println(stu[i][1]);
      }else{
        System.out.print(stu[i][1]);
        System.out.print(" ");
      }
    }
  }
}
