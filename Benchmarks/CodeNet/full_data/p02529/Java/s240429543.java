import java.util.Scanner;
import java.util.Arrays;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int s[] = new int[n];
    for (int i = 0; i < n; i++) {
      s[i] = sc.nextInt();
    }
    int q = sc.nextInt();
    int t[] = new int[q];
    for (int i = 0; i < q; i++) {
      t[i] = sc.nextInt();
    }
    int counter = 0;
    Arrays.sort(s);
    for (int i = 0; i < n; i++) {
      if (Arrays.binarySearch(s, t[i])) {
        counter++;
      }
    }
    System.out.println(counter);
  }
  
}