import java.util.*;

public class Main {
  public static int merge(List<Integer> list, int left, int mid, int right, int count) {
    int n1 = mid - left;
    int n2 = right - mid;
    int[] arrL = new int[n1 + 1];
    int[] arrR = new int[n2 + 1];
    for(int i = 0; i < n1; i++) {
      arrL[i] = list.get(left + i);
    }
    arrL[n1] = Integer.MAX_VALUE;
    for(int i = 0; i < n2; i++) {
      arrR[i] = list.get(mid + i);
    }
    arrR[n2] = Integer.MAX_VALUE;
    int i = 0;
    int j = 0;
    for(int k = left; k < right; k++) {
      if(arrL[i] <= arrR[j]) {
        list.set(k, arrL[i]);
        i++;
      } else {
        list.set(k, arrR[j]);
        j++;
      }
    }
    count += right - left;
    return count;
  }
  public static int mergeSort(List<Integer> list, int left, int right) {
    if(left + 1 < right) {
      int mid = (left + right) / 2;
      int count1 = mergeSort(list, left, mid);
      int count2 = mergeSort(list, mid, right);
      int count = merge(list, left, mid, right, count1 + count2);
      return count;
    } else {
      return 0;
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Integer> arr = new ArrayList<>();
    for(int i = 0; i < n; i++) {
      arr.add(sc.nextInt());
    }
    int count = mergeSort(arr, 0, n);
    for(int i = 0; i < n; i++) {
      if(i == n - 1) {
        System.out.println(arr.get(i));
      } else {
        System.out.print(arr.get(i) + " ");
      }
    }
    System.out.println(count);
  }
}

