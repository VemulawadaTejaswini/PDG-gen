import java.util.*;
import java.math.*;

class Main {
  public static void main(String[] args){
  Scanner stdIn = new Scanner(System.in);
  int n = stdIn.nextInt();
  int[] a = new int[n];
  int[] b = new int[2*n];
  int max = 0;
  int j = 0;
  int k = 0;
  for(int i = 0;i<a.length;i++) {
    a[i] = stdIn.nextInt();
  }
  for(int i = 0;i<a.length;i++) {
    if(i!=a.length-1){
    b[j] = kouyaku(a[i],a[i+1]);
    j +=1;
    if(max>b[j-1]) max = b[j-1];
  } else {
    b[j] = kouyaku(a[i],a[0]);
    j += 1;
    if(max>b[j-1]) max = b[j-1];
  }
 }

}
  static int kouyaku(int a,int b) {
    int c = 0;
    int k = 0;
    if(a>b){
    while(true) {
      c = a%b;
      a = b;
      b = c;
      if(c ==0) break;
    }
  } else if(a<b) {
    while(true) {
      c = b%a;
      b = a;
      a = c;
      if(c==0) break;
    }
  } else {
    c= a;
  }
  return c;
  }
}