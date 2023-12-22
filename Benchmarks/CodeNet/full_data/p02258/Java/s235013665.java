import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();

    int[] array = new int [n];
    for(int i = 0; i < n; i++){
      array[i] = scan.nextInt();
    }

    int max = MaxRate(array);
    System.out.println(max);
  }

  static int MaxRate(int array[]){
    int minv = array[0];
    int maxv = array[1] - array[0];

    for(int j = 1; j < array.length; j++){
      if(maxv < array[j] - minv){
        maxv = array[j] - minv;
      }
      if (minv > array[j]){
        minv = array[j];
      }
    }
    return maxv;
  }
}

