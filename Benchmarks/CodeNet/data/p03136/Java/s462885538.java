import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    final int N=sc.nextInt();
    int[] x=new int[N];
    for(int i=0;i<N;i++){
      x[i]=sc.nextInt();
    }
    Arrays.sort(x);
    int sum=0;
    for(int i=0;i<N-1;i++){
      sum+=x[i];
    }
    if(sum>x[N-1]){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}