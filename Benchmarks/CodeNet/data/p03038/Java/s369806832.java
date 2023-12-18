import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int m = stdIn.nextInt();
    int[] a = new int[n];
    int[] b = new int[m];
    int[] c = new int[m];
    long s = 0;
    for(int i = 0;i<a.length;i++) {
      a[i] = stdIn.nextInt();
    }
    for(int i = 0;i<b.length;i++) {
      b[i] = stdIn.nextInt();
      c[i] = stdIn.nextInt();
    }
    s = sum(a);
    sort(a);
    for(int i = 0;i<b.length;i++) {
      for(int j = 0;j<b[i];j++) {
        int tep = 0;
        tep = a[j];
        a[j] = c[i];
          if(s<=sum(a)) {
            s = sum(a);
          } else {
            a[j] = tep;
          }
        }
    }
    long sum = 0;
    for(int i = 0;i<a.length;i++) {
      sum += a[i];
    }
    System.out.println(sum);
  }
  /*static void bublesort(int[] a) {
    for(int i = 0;i<a.length;i++) {
      if(a[i]>a[i+1]&&i<=a.length) {
        int tep = a[i];
        a[i] = a[i+1];
        a[i+1] = tep;
      }
    }*/
    public static void sort(int[] array){
       int temp;
       for(int i = 0; i < array.length; i++){
           for(int j = 0; j< array.length -i -1; j ++){
               if(array[j] > array[j + 1]){
                   temp = array[j];
                   array[j] = array[j + 1];
                   array[j + 1] = temp;
               }
           }
       }
  }
  public static long sum(int[] a) {
    long tin = 0;
    for(int i = 0;i<a.length;i++) {
      tin += a[i];
    }
    return tin;
  }
}