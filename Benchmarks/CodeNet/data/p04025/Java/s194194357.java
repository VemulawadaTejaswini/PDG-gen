import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long ans = 100000000;
    int array[] = new int[N];
    for(int i=0;i<N;i++){
      array[i] = sc.nextInt();
    }
    int target;
    for(int i=-100;i<=100;i++){
      target = i;
      long cost = 0;
      for(int j=0;j<N;j++){
        cost += Math.pow(array[j]-target,2);
      }
      ans = Math.min(cost,ans);
    }
    System.out.println(ans);

  }
}