import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    //2塔の差が2なら左の塔は1
    //差が3なら1+2,差が4なら1+2+3.....
    //差がnなら1+2+3+.....+(n-1)=n(n-1)/2
    //右の塔はn(n+1)/2

    int c = b - a;

    int left_monu = c*(c-1)/2;
    int right_monu = c*(c+1)/2;

    //System.out.println(left_monu-a);
    System.out.println(right_monu-b);






  }
}