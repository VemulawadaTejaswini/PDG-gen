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
    h[0] = Math.min(l,r);
    h[0] = h[0]%2019;
    for(int i = 1;i<h.length;i++) {
      h[i] = h[i-1]%2019 + 1;
    }
    int min = 3000;
    for(int i = 0;i<h.length;i++) {
      min = Math.min(min,h[i]);
    }
    //System.out.println(min);
    int count = 0;
    for(int i = 0;i<h.length;i++) {
      if(min==h[i]) count+=1;
    }
    if(count>=2) {
      System.out.println((min*min)%2019);
      System.exit(0);
    }else if(count==1){
      int min1 = 3000;
      for(int i = 0;i<h.length;i++) {
        if(min!=h[i]) min1 = Math.min(min1,h[i]);
      }
      //System.out.println(min1);
      System.out.println((min*min1)%2019);
    }
}
}