import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    String[] S = new String[N];
    int[] count = new int[5];
    long ans = 0;

    for (int i = 0; i < N; i++){
      S[i] = scanner.next();
    }
    for (int i = 0; i < N; i++){
      if(S[i].charAt(0) == 'M'){
        count[0]++;
      } else if (S[i].charAt(0) == 'A'){
        count[1]++;
      } else if (S[i].charAt(0) == 'R'){
        count[2]++;
      } else if (S[i].charAt(0) == 'C'){
        count[3]++;
      } else if (S[i].charAt(0) == 'H'){
        count[4]++;
      } else {return;
      }
    ans = count[0] * count[1] * count[2] + count[0] * count[1]* count[3] +
    count[0] * count[1]* count[4] + count[0] * count[2]* count[3] +
    count[0] * count[2]* count[4] + count[0] * count[3]* count[4] +
    count[1] * count[2]* count[3] + count[1] * count[2]* count[4] +
    count[1] * count[3]* count[4] + count[2] * count[3]* count[4];
    }
    System.out.println(ans);
  }
}
