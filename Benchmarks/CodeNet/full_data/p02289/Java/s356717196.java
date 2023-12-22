import java.util.*;

public class Main{

  static int h=0;
  static long[] a;

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    a = new long[3000000];
    while (true){
      String inst = sc.next();
      if (inst.equals("end")) break;
      switch (inst){
        case "insert":
          insert(sc.nextLong());
          break;
        case "extract":
          System.out.println(extract());
          break;
      }
    }
  }

  public static void insert(long k){
    h++;
    a[h] = k;
    buildMaxHeap();
  }

  public static long extract(){
    long ret = a[1];
    a[1] = a[h];
    h--;
    buildMaxHeap();
    return ret;
  }

  public static int left(int i){
    return 2*i;
  }

  public static int right(int i){
    return 2*i+1;
  }

  public static int parent(int i){
    return i/2;
  }

  public static void maxHeapify(int i){
    int l = left(i);
    int r = right(i);
    int largest;
    if (l <= h && a[l]>a[i]){
      largest = l;
    } else {
      largest = i;
    }
    if (r <= h && a[r] > a[largest]){
      largest = r;
    }

    if (largest != i){
      long t = a[i];
      a[i] = a[largest];
      a[largest] = t;
      maxHeapify(largest);
    }
  }

  public static void buildMaxHeap(){
    for (int i=h/2; i>0; i--){
      maxHeapify(i);
    }
  }
}
