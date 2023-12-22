import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] num_lst = new int[n];
    for (int i = 0; i < n; i++){
      num_lst[i] = sc.nextInt();
    }
    insertion_sort(num_lst, n);
  }

  public static void insertion_sort(int[] lst, int n){
    for (int i = 0; i < n; i++){
      int current = lst[i];
      int j = i - 1;
      while (j >= 0 && lst[j] > current){
        lst[j + 1] = lst[j];
        j --;
      }
      lst[j + 1] = current;
      show(lst, n);
    }
  }

  public static void show(int[] lst, int n){
    for (int i = 0; i < n; i++){
      if (i == n - 1){
        System.out.println(lst[i]);
      }else{
        System.out.print(lst[i] + " ");
      }
    }
  }
}

