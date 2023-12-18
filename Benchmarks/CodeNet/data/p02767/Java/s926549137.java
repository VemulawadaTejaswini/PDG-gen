import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] array = new int[n];
    int sum = 0;

    for(int i=0; i<n; i++){
      array[i] = sc.nextInt();
      sum += array[i];
    }

    int p=0;
    if((double)sum/n-sum/n!=0){
      if(sum/n+1-(double)sum/n > (double)sum/n-sum/n){
        p = sum/n;
      }else{
        p = sum/n + 1;
      }
    }

    long ans = 0;

    for(int a: array){
      ans += (a-p) * (a-p);
    }

    System.out.println(ans);
  }
}