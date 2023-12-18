import java.util.*;
public class Main{
  public static int r1(int a){
    int sum = 0;
    while(a != 0){
      sum += a % 10;
      a /= 10;
    }
    return sum;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int min = r1(n);
    for(int j = 0; j < n; j++){
      if(r1(j) + r1(n - j) < min)
        min = r1(j) + r1(n - j);
    }
    System.out.println(min);
  }
}