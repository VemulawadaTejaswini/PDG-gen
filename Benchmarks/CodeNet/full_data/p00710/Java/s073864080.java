import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    while(true) {
      int n = sc.nextInt();
      int r = sc.nextInt();
      int cards[] = new int[n];

      if(n == 0 && r == 0) {
        break;
      }

      for(int i = 0; i < n; i++) {
        cards[i] = n - i;
      }

      for(int i = 0; i < r; i++) {
        int p = sc.nextInt();
        int c = sc.nextInt();
        int temp[] = new int[c];

        for(int j = 0; j < c; j++) {
          temp[j] = cards[p - 1 + j];
        }
        for(int j = p - 2; j >= 0; j--) {
          cards[c + j] = cards[j];
        }
        for(int j = 0; j < c; j++) {
          cards[j] = temp[j];
        }
      }
      System.out.println(cards[0]);
    }
  }
}