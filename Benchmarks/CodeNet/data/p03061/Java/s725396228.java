import java.util.Scanner;

class Main {

  static int gcd(int a,int b) {
    for (int i=a;a>0;i--) {

    if (a%i==0&&b%i==0) {

    return i;

    }

    }return 1;
  }

  static int arrayGCD(int[] a) {
    for(int i=1; i<a.length; i++) {
      a[i] = gcd(a[i-1],a[i]);
    }
    return a[a.length-1];
  }

  static int[] remove(int[] a,int idx) {
    int[] x = new int[a.length-1];
    int j = 0;
    for(int i = 0; i<a.length; i++) {
      if(i != idx) {
        x[j] = a[i];
        j++;
      }
    }
    return x;
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int[] a = new int[n];
    for(int i = 0; i<n; i++) {
      a[i] = stdIn.nextInt();
    }

    int[] b = new int[n];
    int max = 0;
    for(int i=0; i<n; i++) {
      b[i] = arrayGCD(remove(a,i));
      if(b[i] > max) {
        max = b[i];
      }
    }
    System.out.println(max);
  }
}