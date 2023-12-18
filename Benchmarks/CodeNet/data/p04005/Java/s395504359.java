import java.util.*;

class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int[] arr =  new int[] {
      scan.nextInt(),
      scan.nextInt(),
      scan.nextInt()
    };

    int minIndex = -1;
    int minKisu = -1;
    for(int i = 0; i < 3; i++) {
      if(arr[i]%2==1&&arr[i] > minKisu) {
        minKisu = arr[i];
        minIndex = i;
      }
    }

    if(minIndex == -1) {
      System.out.println(0);
    }
    else{
      int result = 1;
      for(int i = 0; i < 3; i++) {
        if(i!=minIndex) {
          result *= arr[i];
        }
      }
      System.out.println(result);
    }
  }
}
