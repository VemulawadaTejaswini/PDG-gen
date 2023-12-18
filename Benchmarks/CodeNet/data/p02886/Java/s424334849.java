import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] d = new int[n];
    for(int i=0;i<n;i++)d[i]=sc.nextInt();
    int sum = 0;
    for(int i=0;i<n;i++)
      for(int j=0;j<i;j++){
        if(i!=j)sum+=d[i]*d[j];
      }
    System.out.println(sum);
  }
}