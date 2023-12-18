import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int cnt[]=new int[n];
    for(int i=0;i<2*m;i++){
      cnt[sc.nextInt()-1]++;
    }
    sc.close();
    for(int i=0;i<n;i++){
      System.out.println(cnt[i]);
    }
  }
}