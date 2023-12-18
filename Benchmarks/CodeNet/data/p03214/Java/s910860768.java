import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] array= new int[N];
    for(int i = 0; i < N; i++){
      array[i] = sc.nextInt();
    }
    int sum = 0;
    double ave = 0L;
    for(int i : array){
      sum += i;
    }
    ave = (double)sum / N;
    double min = 10000;
    int minIndex = -1;
    for(int i = 0; i < N; i++){
      double tmp = Math.abs(ave - array[i]);
      if(min > tmp){
        min = tmp;
        minIndex = i;
      }
    }
    System.out.println(minIndex);
  }
}