import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N];
    int x=0;
    int y=0;
    int sum=0;
    int min=0;
    for(int i=0;i<N;i++){
      a[i]=sc.nextInt();
    }
    for(int i=0;i<N;i++){
      sum = sum+a[i];
    }
    for(int i=0;i<N-1;i++){
      x = 0;
      y = sum;
      for(int n=0;n<=i;n++){
        x = x+a[n];
      }
      y = y - x;
      if(i==0){
        min = Math.abs(x-y);
      }
      if(min>Math.abs(x-y)){
        min = Math.abs(x-y);
      }
    }
    System.out.println(min);
  }
}