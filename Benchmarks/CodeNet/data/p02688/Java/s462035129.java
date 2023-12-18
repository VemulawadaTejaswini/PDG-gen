import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int[] count = new int[num];

    int kind = sc.nextInt();
    for (int i = 0 ;kind > i ;i ++) {
      int haveCount = sc.nextInt();
      for (int j = 0 ;haveCount > j ;j ++) {
        int haveIndex = sc.nextInt();
        count[haveIndex -1 ]++;
      }
    }

    int resultCount = 0;
    for (int i = 0; i < num ;i++) {
      if (count[i] == 0) resultCount++;
    }
    
    System.out.println(resultCount);    

  }

}
