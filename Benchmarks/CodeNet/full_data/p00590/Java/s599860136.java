import java.util.*;

public class Main {
  private static List<Integer> getPrime(int n) {
    Deque<Integer> seek = new ArrayDeque<>();
    seek.add(2);
    for (int i = 3; i <= n; i += 2) {
      seek.add(i);
    }
    List<Integer> primes = new ArrayList<>();
    while (true) {
      int prime = seek.poll();
      primes.add(prime);
      if ((double) prime >= Math.sqrt(n)) {
        primes.addAll(seek);
        break;
      }
      Deque<Integer> newSeek = new ArrayDeque<>();
      while (!seek.isEmpty()) {
        int val = seek.poll();
        if (val % prime == 0) continue;
        newSeek.add(val);
      }
      seek.clear();
      seek.addAll(newSeek);
    }
    return primes;
  }
  private static int countPair(int n, Set<Integer> primeSet) {
    int count = 0;
    for (int i = 1; i <= n; i++) {
      if (primeSet.contains(i) && primeSet.contains(n + 1 - i)) {
        count++;
      }
    }
    return count;
  }
  private static void solve(List<Integer> n) {
    int max = 1;
    for (int val : n) max = Math.max(max, val);
    List<Integer> primes = getPrime(max);
    Set<Integer> primeSet = new HashSet<>();
    primeSet.addAll(primes);
    int count = 0;
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n.size(); i++) {
      if (i > 0) sb.append("\n");
      sb.append(countPair(n.get(i), primeSet));
    }
    System.out.println(sb.toString());
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> n = new ArrayList<>();
    while (sc.hasNextLine()) {
      String line = sc.nextLine();
      n.add(Integer.parseInt(line));
    }
    sc.close();
    solve(n);
  }
}

