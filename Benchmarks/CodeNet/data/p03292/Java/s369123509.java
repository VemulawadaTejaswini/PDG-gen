import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[3];
    for(int i = 0;i<3;i++){
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);
    int dis = 0;
    for(int i = 0;i<2;i++){
      dis += a[i+1] - a[i];
    }
    System.out.println(dis);
  }
}
