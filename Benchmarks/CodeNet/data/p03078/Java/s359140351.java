import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();
    int k = sc.nextInt();
    long[] a = new long[x];
    long[] b = new long[y];
    long[] c = new long[z];
    long[] ab = new long[x * y];
    for(int i = 0; i < x; i++){
      a[i] = sc.nextLong();
    }
    for(int i = 0; i < y; i++){
      b[i] = sc.nextLong();
    }
    for(int i = 0; i < z; i++){
      c[i] = sc.nextLong();
    }
    Arrays.sort(a);
    Arrays.sort(b);
    Arrays.sort(c);
    int index = 0;
    for(int i = 0; i < x; i++){
      for(int j = 0; j < y; j++){
        ab[index] = a[i] + b[j];
        index++;
      }
    }
    Arrays.sort(ab);
    long[] abc = new long[Math.min(x*y, 3000) * z];
    index = 0;
    for(int i = 0; i < Math.min(x*y, 3000); i++){
      for(int j = 0; j < z; j++){
        abc[index] = ab[x*y-1-i] + c[z-1-j];
        index++;
      }
    }
    Arrays.sort(abc);
    for(int i = 0; i < k; i++){
      System.out.println(abc[abc.length-1-i]);
    }
  }
}