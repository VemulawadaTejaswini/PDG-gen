import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    int min = 10;
    int[] a = new int[5];
    for(int i = 0; i < 5; i++){
      a[i] = sc.nextInt();
      if(a[i] % 10 != 0){
        min = Math.min(min, a[i] % 10);
        sum += (a[i] / 10 + 1) * 10;
      }else{
        sum += a[i];
      }
    }
    System.out.println(min);
    sum -= 10 - min;
    System.out.println(sum);
  }
}