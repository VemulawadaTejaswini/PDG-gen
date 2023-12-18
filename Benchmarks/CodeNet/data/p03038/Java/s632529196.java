import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int M = scan.nextInt();
    int cards[] = new int[N];
    for (int i = 0; i < N; i++) {
      cards[i] = scan.nextInt();
    }
    
    int tmp = 0;
    for (int i = 0; i < M; i++) {
      Arrays.sort(cards);
      int B = scan.nextInt();
      int C = scan.nextInt();
      for (int j = 0; j < N; j++) {
        if (C <= cards[j]) break;
        if (cards[j] < C && 0 < B) {
          cards[j] = C;
          B--;
        }
      }
    }
    
    int sum = 0;
    for (int i = 0; i < N; i++) {
      sum += cards[i];
    }
    System.out.println(sum);
  }
}