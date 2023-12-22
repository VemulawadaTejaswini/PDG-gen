import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] bucket = new int[100];
    int max = 0;
    while (sc.hasNext()) {
      int num = sc.nextInt();
      bucket[num - 1]++;
      if (bucket[num - 1] > max) {
        max = bucket[num - 1];
      }
    }
    for (int i =0; i < 100; i++) {
      if (bucket[i] == max) {
        System.out.println(i + 1);
      }
    }
  }
}