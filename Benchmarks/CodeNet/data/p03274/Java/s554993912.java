import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long n = scan.nextLong();
    int k = scan.nextInt();
    ArrayList<Long> a = new ArrayList<Long>();
    ArrayList<Long> b = new ArrayList<Long>();
    for (int i=0;i<n;i++){
      long g = scan.nextLong();
      if (g == 0){
        k -= 1;
      }
      if (g < 0){
        g = -g;
        a.add(g);
      }
      else if (g > 0){
        b.add(g);
      }
    }

    if (k <= 0){
      System.out.println(0);
      return;
    }

    int a1 = a.size();
    int b1 = b.size();

    long[] c = new long[a1+1];
    long[] d = new long[b1+1];

    for(int j=0;j<b1;j++){
      d[j+1] = b.get(j);
    }

    for(int k1=0;k1<a1;k1++){
      c[k1+1] = a.get(a1-k1-1);
    }

    long sum = 0;

    if (a1>=k){
      sum = c[k];
      for (int p=1;p<b1;p++){
        if (p > k){
          break;
        }
        long current = 0;
        if (c[k-p] >= d[p]){
          current += d[p];
        }
        else{
          current += c[k-p];
        }
        current += (c[k-p] + d[p]);

        if (sum > current){
          sum = current;
        }
      }
    }
    else{
      if (c[a1] < d[k-a1]){
        sum += c[a1];
      }
      else{
        sum += d[k-a1];
      }
      sum += c[a1]+d[k-a1];
      for (int p=1;k-a1+p<b1;p++){
        if (k-a1+p > k){
          break;
        }
        long current = 0;
        if (p == a1){
          current = d[k];
          if (sum > current){
            sum = current;
          }
          break;
        }

        if (c[a1-p] >= d[k-a1+p]){
          current += d[k-a1+p];
        }
        else{
          current += c[a1-p];
        }
        current += c[a1-p] + d[k-a1+p];
        if (sum > current){
          sum = current;
        }
      }
    }
    System.out.println(sum);
  }
}
