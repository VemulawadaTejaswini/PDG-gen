import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int[] data = new int[1000];
    int n = scanner.nextInt();
    for(int i = 0; i < n; i++){
      data[i] = scanner.nextInt();
    }
    for(int i = 0; i < n - 1; i++){
      for(int j = n - 1; j > i; j--){
        if(data[j - 1] > data[j]){
          int temp = data[j];
          data[j] = data[j - 1];
          data[j - 1] = temp;
        }
      }
    }
    for(int i = 0; i < n; i++){
    System.out.printf("%d ", data[i]);
    System.out.printf("\n");
  }
  }
}