import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int max1 = 0;
    int max2 = 0;
    int b = 0;
    int[] a = new int[100000];
    int n = sc.nextInt();
    for(int i = 0; i <n; i++){
      int key = sc.nextInt();

      for(int j = 0; j<=b; j++){
        if(a[j] == key) {
          if(max1 < key) {
            max2 = max1;
            max1 = key;
          }
          else if(max2 < key) max2 = key;
          a[j] = 0;
          break;
        }
        if(j == b){
          a[b] = key;
          b++;
          break;
        }
      }
    }
    System.out.println(max1*max2);
  }
}
