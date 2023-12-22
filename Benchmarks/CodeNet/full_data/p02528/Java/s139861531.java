import java.util.ArrayList;
import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<Integer>();
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      list.add(sc.nextInt());
    }
    quickSort(list, 0, n-1);
    for (int i = 0; i < n-1; i++) {
      System.out.print(list.get[i] + " ");
    }
    System.out.println(list.get[n-1]);
  }
  public static void quickSort(ArrayList<Integer> list, int left, int right) {
    if (left <= right) {
      int pivot = arr[(left+right)/2];
      int l = left;
      int r = right;
      while (l <= r) {
        while (list.get[l] < pivot) {
          l++;
        }
        while (list.get[r] > pivot) {
          r--;
        }
        if (l < r) {
          int tmp = list.get[l];
          list.set(l, list.get[r]);
          list.set(r, tmp);
          l++;
          r--;
        }
      }
      quickSort(list, left, r);
      quickSort(list, l, right);
    }
  }
  
}