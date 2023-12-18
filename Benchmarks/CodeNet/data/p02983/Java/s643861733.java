import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int l = stdIn.nextInt();
    int r = stdIn.nextInt();
    int k = 0;
    if(l>r) {
      k = l - r;
    } else if(l<r) {
      k = r - l;
    } else if(l==r) {
      k = (l*r)%2019;
      System.out.println(k);
      System.exit(0);
    }
    int[] h = new int[k+1];
    int[] a = new int[k+1];
    h[0] = Math.min(l,r);
    for(int i = 1;i<a.length;i++) {
      h[i] = h[i-1] + 1;
    }
    int[] b = new int[k];
    for(int i = 0;i<a.length-1;i++) {
      b[i] = h[i]*h[i+1];
    }
    int[] c = new int[k];
    for(int i = 0;i<c.length;i++) {
      c[i] = b[i]%2019;
    }
    int min = c[0];
    for(int i = 1;i<c.length;i++) {
      min = Math.min(min,c[i]);
    }
    System.out.println(min);
  }
  }