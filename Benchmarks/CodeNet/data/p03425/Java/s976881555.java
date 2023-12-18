import java.util.Scanner;

public class Main { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    char[] S = new char[N];
    int[] count = new int[5];
    int check =0;
    for (int i =0; i<N; i++) {
      S[i] = sc.next().charAt(0);
      if (S[i] == 'M') count[0]++;
      if (S[i] == 'A') count[1]++;
      if (S[i] == 'R') count[2]++;
      if (S[i] == 'C') count[3]++;
      if (S[i] == 'H') count[4]++;
    }
    for (int i =0; i<5; i++) {
      if (count[i] == 0) check++;
    }
    if (check >= 3) {
        System.out.println(0);
    } else {
      System.out.println((long)count[0] * count[1] * count[2] +
                         count[0] * count[1] * count[3] +
                         count[0] * count[1] * count[4] +
                         count[0] * count[2] * count[3] +
                         count[0] * count[2] * count[4] +
                         count[0] * count[3] * count[4] +
                         count[1] * count[2] * count[3] +
                         count[1] * count[2] * count[4] +
                         count[1] * count[3] * count[4] +
                         count[2] * count[3] * count[4]);
    }
  }
}    