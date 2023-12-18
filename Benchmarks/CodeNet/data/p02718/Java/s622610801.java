import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] votes = new int[N];
    for (int i = 0; i < N; i++) {
      votes[i] = sc.nextInt();
    }
    int totalVotes = Arrays.stream(votes).sum();
    if (M <= Arrays.stream(votes)
      .filter(e -> e >= totalVotes/(M*4))
      .count()) {
      System.out.println("Yes"); 
    } else {
      System.out.println("No");
    }
  }
}