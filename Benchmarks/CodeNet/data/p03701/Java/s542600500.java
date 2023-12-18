   import java.util.Scanner;
 
    class Main {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
    int N = sc.nextInt();
    int S[];
    for(int i = 0; i < N; i++) {
    S[i] = sc.nextInt();
    }
    
    int s = 0;
    for(int i = 0; i < N; i++) {
    s += S[i];
    }
    Arrays.sort(S[]);
        for(int i = 0; i < N; i++) {
            if(s % 10 != 0) {
              System.out.println(s);
            return;
            }else {
              s -= S[i];
            }
        }
        System.out.println(0);
  }
}