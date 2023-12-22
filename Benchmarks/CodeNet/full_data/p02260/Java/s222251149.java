import java.util.Scanner;

class Main{
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] num_list = new int[n];
    for (int i = 0; i < n; i++){
      num_list[i] = sc.nextInt();
    }
    selection_sort(num_list, n);
  }

  public static void output(int[] lst, int n){
    for (int i = 0; i < n; i++){
      if (i == n - 1){
        System.out.println(lst[i]);
      }else{
        System.out.print(lst[i] + " ");
      }
    }
  }

  public static void selection_sort(int[] lst, int n){
    int count = 0;
    for (int i = 0; i < n; i++){
      int minj = i;
      for (int j = i;j < n; j++){
        if (lst[j] < lst[minj]){
          minj = j;

        }
      }
      if (minj != i){
        int tmp = lst[i];
        lst[i] = lst[minj];
        lst[minj] = tmp;  
        count ++;  
      }

    }
    output(lst, n);
    System.out.println(count);
  }
}

