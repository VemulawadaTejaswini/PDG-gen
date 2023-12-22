import java.util.*;

public class Main{
  public static void main(String[] args){
    int n,r,p,c,num;
    Scanner sc = new Scanner(System.in);
    while((n = sc.nextInt()) != 0 | (r = sc.nextInt()) != 0){
      num=1;
      int[] cards = new int[n];
      for(int i=n-1;i>=0;i--){
        cards[i]=num;
        num++;
      }
      for(int i=0;i<r;i++){
        p = sc.nextInt();
        c = sc.nextInt();
        int[] cardsc = new int[c];
        for(int j=p-1;j<p-1+c;j++)cardsc[j-(p-1)] = cards[j];
        for(int j=p-2;j>=0;j--)cards[j+c] = cards[j];
        for(int j=0;j<c;j++)cards[j]=cardsc[j];
        //for(int j=0;j<n;j++)System.out.println(" " + cards[j]);
      }
      System.out.println(cards[0]);
    }
  }
}
