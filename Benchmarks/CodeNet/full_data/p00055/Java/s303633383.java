import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      double[] a = new double[10];
      a[0] = sc.nextDouble();
      for(int i=1; i<10; i++) {
        if(i % 2 == 0) {
	  a[i] = a[i-1]/3;
        }
	else {
          a[i] = a[i-1]*2;
        }
      }
      double s=0;
      for(int i=0; i<10; i++) {
        s+=a[i];
      }
      System.out.println(s);
    }
  }
}