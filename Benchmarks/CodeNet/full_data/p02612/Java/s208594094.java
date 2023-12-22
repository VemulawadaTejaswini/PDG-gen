public static void main() {
  getChange(N);
}
public static int getChange(int N) {
  while (N > 1000) {
    N = N - 1000;
  }
  return N;
}
