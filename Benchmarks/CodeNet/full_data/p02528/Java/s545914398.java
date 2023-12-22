import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    quickSort(arr, 0, n-1);
    for (int i = 0; i < n-1; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println(arr[n-1]);
  }
  public static void quickSort(int[] arr, int left, int right) {
    if (left <= right) {
      int pivot = arr[(left+right)/2];
      int l = left;
      int r = right;
      while (l <= r) {
        while (arr[l] < pivot) {
          l++;
        }
        while (arr[r] > pivot) {
          r--;
        }
        if (l < r) {
          int tmp = arr[l];
          arr[l] = arr[r];
          arr[r] = tmp;
          l++;
          r--;
        }
      }
      quickSort(arr, left, r);
      quickSort(arr, l, right);
    }
  }
  
}