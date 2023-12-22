import java.util.Scanner;

public class Main {

  private static int partition(int[] array, int p, int r) {
    int pivot = array[r];
    int i = p - 1;
    int j = p;

    while (j < r) {
      if (array[j] < pivot) {
        i++;
        swap(array, i, j); 
      }   
      j++;
    }   
    swap(array, i + 1, r); 

    return i + 1;
  }

  private static void swap(int[] array, int i, int j) {
    int tmp = array[j];
    array[j] = array[i];
    array[i] = tmp;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.next();

    //String[] parsed = args[0].split("\n");
    int N = Integer.valueOf(str);
    //System.out.println(N);

    //String input = parsed[1];
    int[] array = new int[N];
    for (int i = 0; i < N; i++) {
      array[i] = scan.nextInt();
      //System.out.println(array[i]);
    }   

    int part = partition(array, 0, array.length - 1); 

    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < N; i++) {
      if (i == part) {
        builder.append("[" + array[i] + "]");
      } else {
        builder.append(array[i]);
      }   
      builder.append(" ");
    }   
    System.out.println(builder.toString().trim());

  }
}